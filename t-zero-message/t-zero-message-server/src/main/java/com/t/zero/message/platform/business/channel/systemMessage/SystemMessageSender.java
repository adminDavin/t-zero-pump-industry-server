package com.t.zero.message.platform.business.channel.systemMessage;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;


@Lazy
@Component(value = "SYSTEM_MESSAGE")
public class SystemMessageSender implements Channel {
    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private MessageInstanceMapper messageInstanceMapper;
    @Autowired
    private MessageInstanceConverter  messageInstanceConverter;


    @Override
    public Channel init(JsonNode channel) {
        return null;
    }

    @Override
    public boolean send(ChannelDefined channel, String title, String content,List<SimpleUser> sendUsers,String businessType, String templateCode) {
        sendUsers.forEach(user->{
            ObjectNode objectNode =  user.getUserInfo();
            List<Integer> templateIds = user.getTemplateIds();
            if(!objectNode.isEmpty()){
                try {
                    JsonNode userNode = mapper.readTree(objectNode.toString());
                    MessageInstanceVo messageInstance = new MessageInstanceVo();
                    messageInstance.setBusinessType(businessType);
                    messageInstance.setChannelCode(channel.getChannelCode());
                    ObjectNode contentNode = mapper.createObjectNode();
                    contentNode.put("title",title);
                    contentNode.put("content",content);
                    messageInstance.setMessageContent(contentNode);
                    messageInstance.setProductId(1);
                    messageInstance.setUserId(userNode.get("userId").asInt());
                    messageInstance.setTemplateId(templateIds.size()>0?templateIds.get(0):null);
                    var record = messageInstanceConverter.convert(messageInstance);
                    record.setCreatedUserId(userNode.get("userId").asText());
                    record.setUpdatedUserId(userNode.get("userId").asText());
                   messageInstanceMapper.insert(record);

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        });


        return true;
    }


}
