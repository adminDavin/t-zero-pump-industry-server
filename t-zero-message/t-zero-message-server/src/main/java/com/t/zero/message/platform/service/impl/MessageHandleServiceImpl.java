package com.t.zero.message.platform.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.message.platform.amqp.constants.MessageTemplateConstant;
import com.t.zero.message.platform.business.ChannelService;
import com.t.zero.message.platform.business.channel.ChannelCodeEnum;
import com.t.zero.message.platform.business.channel.UserSendModel;
import com.t.zero.message.platform.business.channel.UserSendder;
import com.t.zero.message.platform.business.channel.UserSendder.SimpleUser;
import com.t.zero.message.platform.dao.auto.ChannelDefinedMapper;
import com.t.zero.message.platform.dao.auto.ChannelInstanceMapper;
import com.t.zero.message.platform.dao.auto.MessageInstanceMapper;
import com.t.zero.message.platform.dao.auto.MessageTemplateMapper;
import com.t.zero.message.platform.model.auto.*;
import com.t.zero.message.platform.service.MessageHandleService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Log4j2
public class MessageHandleServiceImpl implements MessageHandleService {
    public final static String DEMAND_CODE = "demandCode";
    public final static String DAMAND_CODE = "damandCode";
    @Autowired
    private ChannelService channelService;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MessageTemplateMapper messageTemplateMapper;

    @Autowired
    private MessageInstanceMapper messageInstanceMapper;

    @Autowired
    private ChannelInstanceMapper channelInstanceMapper;

    @Autowired
    private ChannelDefinedMapper channelDefinedMapper;

    @Override
    public void handle(JsonNode data) throws Exception {
        //模板
        var messageTemplates = getMessageTemplates(data.get(MessageTemplateConstant.TENANT_ID).asInt(), data.get(MessageTemplateConstant.TEMPLATE_TYPE).asText());
        //默认渠道
        List<ChannelDefined> defaultChanels = getDefaultChannels(messageTemplates);
        if (defaultChanels.size() > 0) {
            //确定用户需要发的消息，滤掉忽略的渠道
            var userSendModels = getUserSendModels(messageTemplates, defaultChanels, data);
            var variables = mapper.convertValue(data.get(MessageTemplateConstant.VARIABLES), new TypeReference<Map<String, String>>() {});
            
            String businessType = data.get(MessageTemplateConstant.BUSINESSTYPE).asText();
            var userTemplateMap = messageTemplates.stream().collect(Collectors.groupingBy(MessageTemplate::getChannelId));

            Map<Integer, UserSendder> userSenderMap = new HashMap<>(userTemplateMap.size());
            for (var item : userTemplateMap.keySet()) {
                var userSender = new UserSendder();
                userSender.setUserInfos(new ArrayList<>());
                userSender.setUserTemplates(userTemplateMap.get(item));
                userSenderMap.put(item, userSender);
            }

            for (var item : userSendModels) {
                for (var channel : item.getChannels()) {
                    var userTemplates = userTemplateMap.get(channel.getId());
                    if (CollectionUtils.isEmpty(userTemplates)) {
                        continue;
                    }
                    var userSender = userSenderMap.get(channel.getId());
                    userSender.addUser(item.getUserInfo(), userTemplates.stream().map(i -> i.getId()).collect(Collectors.toList()));
                    userSender.setChannelDefined(channel);
                }
            }

            for (var channelId : userSenderMap.keySet()) {
                var userSender = userSenderMap.get(channelId);

                for (var template : userSender.getUserTemplates()) {
                    List<SimpleUser> sendUsers = userSender.getUserInfos().stream().filter(item -> item.getTemplateIds().contains(template.getId())).collect(Collectors.toList());
                    var templateDesc = mapper.readTree(template.getTemplateDesc());
                    var tempTitle = templateDesc.get(MessageTemplateConstant.TITLE).asText();
                    var tempContent = templateDesc.get(MessageTemplateConstant.CONTENT).asText();
                    var strSubstitutor = new StringSubstitutor(variables);
                    var title = strSubstitutor.replace(tempTitle);
                    var content = strSubstitutor.replace(tempContent);
                    var templateCode = template.getTemplateCode();

                    if (userSender.getChannelDefined() != null) {
                        if (userSender.getChannelDefined().getChannelCode().equals("aliyunSmsSender")) {
                            businessType = getBusinessType(variables, businessType);
                        }
                        channelService.send(userSender.getChannelDefined(), title, content, sendUsers, businessType, templateCode);
                    }

                }
            }
        }

    }

    private String getBusinessType(Map<String, String> variables, String businessType) {
        if (variables.containsKey("smsCode")) {
            businessType = "{\"smsCode\":" + variables.get("smsCode") + "}";
        } else {
            try {
                ObjectNode objectNode = mapper.createObjectNode();
                if (variables.containsKey("demandCode")) {
                    objectNode.put("demandCode", variables.get("demandCode"));
                }
                if (variables.containsKey("demandName")) {
                    objectNode.put("demandName", variables.get("demandName"));
                }
                if (variables.containsKey("designerName")) {
                    objectNode.put("designerName", variables.get("designerName"));
                }
                if (variables.containsKey(DEMAND_CODE)) {
                    objectNode.put(DAMAND_CODE, variables.get(DEMAND_CODE));
                }
                businessType = mapper.writeValueAsString(objectNode);
            } catch (JsonProcessingException e) {
                log.error("sendMessage erro", e);
            }
        }
        return businessType;
    }

    /**
     * 获取用户发送消息对象
     * 
     * @param data 消息数据
     * @param messageTemplates 涉及场景的消息模版
     * 
     * @return
     */
    private List<UserSendModel> getUserSendModels(List<MessageTemplate> messageTemplates, List<ChannelDefined> defaultChanels, JsonNode data) {
        var tempUsers = data.get(MessageTemplateConstant.USERS);
        List<ObjectNode> users = new ArrayList<>(tempUsers.size());
        List<Integer> userIds = new ArrayList<>(tempUsers.size());

        for (var item : tempUsers) {
            if (item.has(TZeroConstants.USER_ID)) {
                userIds.add(item.get(TZeroConstants.USER_ID).asInt());
            }
            users.add((ObjectNode)item);
        }
        //发短信
        var defaultchanel = defaultChanels.stream().filter(item -> ChannelCodeEnum.ALIYUN_SMS_SENDER.getChannelCode().equals(item.getChannelCode())).distinct().collect(Collectors.toList());

        //用户配置不接受的渠道 key userId value 渠道
        var ignoreUserChannels = getUserChannelConfig(defaultChanels, userIds);

        return users.stream().map(item -> {
            UserSendModel user = new UserSendModel();
            user.setUserInfo(item);
            if (item.has(TZeroConstants.USER_ID)) {
                var userId = item.get(TZeroConstants.USER_ID).asInt();
                user.setUserId(userId);
                if (ignoreUserChannels.containsKey(userId)) {
                    var tempIgnoreChannels = ignoreUserChannels.get(userId).stream().map(i -> i.getChannelId()).collect(Collectors.toList());

                    user.setChannels(defaultChanels.stream().filter(i -> !tempIgnoreChannels.contains(i.getId())).collect(Collectors.toList()));
                } else {
                    user.setChannels(defaultChanels);
                }
            } else {
                user.setChannels(defaultchanel);
            }
            return user;
        }).collect(Collectors.toList());
    }

    /**
     * 获取用户忽略掉的渠道消息
     * 
     * @param channelIds 渠道ID
     * @param userIds 用户ID列表
     * 
     * @return
     */
    private Map<Integer, List<ChannelInstance>> getUserChannelConfig(List<ChannelDefined> defaultChanels, List<Integer> userIds) {
        Map<Integer, List<ChannelInstance>> map = new HashMap<>();
        if (userIds.size() > 0) {
            var channelIds = defaultChanels.stream().map(item -> item.getId()).collect(Collectors.toList());

            var channelInstanceExample = new ChannelInstanceExample();
            channelInstanceExample.createCriteria().andChannelIdIn(channelIds).andUserIdIn(userIds).andChannelStatusEqualTo(TZeroConstants.STATUS_ABNORMAL);
            var channels = channelInstanceMapper.selectByExample(channelInstanceExample);
            return channels.stream().collect(Collectors.groupingBy(ChannelInstance::getUserId));
        } else {
            return map;
        }

    }

    /**
     * 根据渠道ID获取渠道列表
     * 
     * @param channelIds
     * 
     * @return
     */
    private List<ChannelDefined> getDefaultChannels(List<MessageTemplate> messageTemplates) {
        var channelIds = messageTemplates.stream().map(item -> item.getChannelId()).distinct().collect(Collectors.toList());
        if (channelIds.size() > 0) {
            ChannelDefinedExample channelDefinedExample = new ChannelDefinedExample();
            channelDefinedExample.createCriteria().andIdIn(channelIds);
            return channelDefinedMapper.selectByExampleWithBLOBs(channelDefinedExample);
        } else {
            return new ArrayList<>();
        }

    }

    /**
     * 根据模版类型 获取模版列表
     * 
     * @param tenantId
     * @param templateType
     * 
     * @return
     */
    private List<MessageTemplate> getMessageTemplates(Integer tenantId, String templateType) {
        MessageTemplateExample messageTemplateExample = new MessageTemplateExample();
        messageTemplateExample.createCriteria().andTemplateTypeEqualTo(templateType).andTenantIdEqualTo(tenantId).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
        return messageTemplateMapper.selectByExampleWithBLOBs(messageTemplateExample);
    }

    /**
     * 保存发送用户的信息
     * 
     * @param user 用户信息
     * @param channelDefined
     * @param messageTemplate
     * @param content 消息内容
     */
    public void saveUser(JsonNode user, ChannelDefined channelDefined, MessageTemplate messageTemplate, String content) {
        MessageInstance messageInstance = new MessageInstance();
        messageInstance.setUserId(user.get("userId").asInt());
        messageInstance.setChannelCode(channelDefined.getChannelCode());
        messageInstance.setTemplateId(messageTemplate.getId());
        messageInstance.setSendStatus((byte)0);
        messageInstance.setCreatedTime(LocalDateTime.now());
        messageInstance.setUpdatedTime(LocalDateTime.now());
        messageInstanceMapper.insertSelective(messageInstance);
    }

}
