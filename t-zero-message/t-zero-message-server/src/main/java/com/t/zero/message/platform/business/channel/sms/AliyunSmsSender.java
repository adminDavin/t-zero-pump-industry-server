package com.t.zero.message.platform.business.channel.sms;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.message.platform.business.channel.Channel;
import com.t.zero.message.platform.business.channel.UserSendder.SimpleUser;
import com.t.zero.message.platform.converter.MessageInstanceConverter;
import com.t.zero.message.platform.dao.auto.MessageInstanceMapper;
import com.t.zero.message.platform.model.auto.ChannelDefined;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Lazy
@Component(value = "aliyunSmsSender")
public class AliyunSmsSender implements Channel {
    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private MessageInstanceMapper messageInstanceMapper;
    @Autowired
    private MessageInstanceConverter messageInstanceConverter;

    @Override
    public Channel init(JsonNode channel) {
        return null;
    }

    @Override
    public boolean send(ChannelDefined channel, String title, String content, List<SimpleUser> sendUsers, String smsCode, String templateCode) throws Exception {
        var data = mapper.readTree(channel.getChannelDesc());
        String SignName = data.get("SignName").asText();
        String accessKeyId = data.get("accessKeyId").asText();
        String accessSecret = data.get("accessSecret").asText();
        String regionId = data.get("regionId").asText();
        String sysDomain = data.get("sysDomain").asText();
        for (SimpleUser user : sendUsers) {
            ObjectNode objectNode = user.getUserInfo();
            if (!objectNode.isEmpty()) {
                JsonNode userNode = mapper.readTree(objectNode.toString());
                DefaultProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessSecret);
                IAcsClient client = new DefaultAcsClient(profile);
                CommonRequest request = new CommonRequest();
                request.setSysMethod(MethodType.POST);
                request.setSysDomain(sysDomain);
                request.setSysVersion("2017-05-25");
                request.setSysAction("SendSms");
                request.putQueryParameter("PhoneNumbers", userNode.get("phone").asText());
                request.putQueryParameter("SignName", SignName);
                request.putQueryParameter("TemplateCode", templateCode);
                request.putQueryParameter("TemplateParam", smsCode);
                CommonResponse response = client.getCommonResponse(request);
                // Code 短信发送不成功，补偿
                // {"RequestId":"0C4395C2-FAA3-59F0-84A4-D13F619FA7E6","Message":"OK","BizId":"385013032449185533^0","Code":"OK"}
                saveFailMessage(response, channel, userNode);
                log.info("send message response {}", mapper.convertValue(request, ObjectNode.class), response.getData());
            }
        }
        return true;
    }

    private void saveFailMessage(CommonResponse response, ChannelDefined channel, JsonNode userNode) throws Exception {
        JsonNode jsonNode = mapper.readTree(response.getData());

        String code = jsonNode.get("Code").asText();
        if (!(code.equals("OK"))) {
            MessageInstanceVo messageInstance = new MessageInstanceVo();
            messageInstance.setBusinessType("aliyunSmsSender");
            messageInstance.setChannelCode(channel.getChannelCode());
            ObjectNode contentNode = mapper.createObjectNode();
            contentNode.put("title", "短信发送失败，Code：" + jsonNode.get("Code").asText());
            contentNode.put("content", jsonNode.get("Message").asText());
            contentNode.put("phone", userNode.get("phone").asText());
            messageInstance.setMessageContent(contentNode);
            messageInstance.setProductId(1);
            messageInstance.setTemplateId(null);
            var record = messageInstanceConverter.convert(messageInstance);
            messageInstanceMapper.insert(record);

        }
    }

    public static void main(String[] args) throws JsonProcessingException {
        String regex = "(?<=\\$\\{).*?(?=\\})";
        String v = "{\"aa\":\"11\",\"bbb\":\"222\"}";
        ObjectMapper mapper = new ObjectMapper();
        var va = mapper.readTree(v);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("${aa}adbnask${bbb}");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        int i = 1;
        while (matcher.find()) {
            if (i == 1) {
                stringBuffer.append("\"");
                stringBuffer.append(matcher.group());
                stringBuffer.append("\"");
                stringBuffer.append(":");
                stringBuffer.append("\"");
                stringBuffer.append(va.get(matcher.group()).asText());
                stringBuffer.append("\"");
            } else {
                stringBuffer.append(",");
                stringBuffer.append("\"");
                stringBuffer.append(matcher.group());
                stringBuffer.append("\"");
                stringBuffer.append(":");
                stringBuffer.append("\"");
                stringBuffer.append(va.get(matcher.group()).asText());
                stringBuffer.append("\"");
            }
            i++;
        }
        stringBuffer.append("}");
        System.out.println(stringBuffer);
    }
}
