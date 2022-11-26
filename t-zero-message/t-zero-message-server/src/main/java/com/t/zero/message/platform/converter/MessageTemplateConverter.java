package com.t.zero.message.platform.converter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.utils.UUIDUtils;
import com.t.zero.message.platform.model.auto.MessageTemplate;
import com.t.zero.message.platform.vo.request.MessageTemplateVo;

@Component
public class MessageTemplateConverter {

    @Autowired
    private ObjectMapper mapper;

    public List<MessageTemplateVo> convert(List<MessageTemplate> items) {
        return items.stream().map(item -> {
            return MessageTemplateVo.builder()
                .createdTime(item.getCreatedTime())
                .createdUserId(item.getCreatedUserId())
                .tenantId(item.getTenantId())
                .updatedTime(item.getUpdatedTime())
                .updatedUserId(item.getUpdatedUserId())
                .id(item.getId())
                .templateStatus(item.getTemplateStatus())
                .channelId(item.getChannelId())
                .templateCode(item.getTemplateCode())
                .templateName(item.getTemplateName())
                .templateType(item.getTemplateType())
                .build();
        })
            .filter(item -> ObjectUtils.isNotEmpty(item))
            .collect(Collectors.toList());
    }

    public MessageTemplateVo convert(MessageTemplate item) throws JsonMappingException, JsonProcessingException {
        return MessageTemplateVo.builder()
            .createdTime(item.getCreatedTime())
            .createdUserId(item.getCreatedUserId())
            .tenantId(item.getTenantId())
            .updatedTime(item.getUpdatedTime())
            .updatedUserId(item.getUpdatedUserId())
            .id(item.getId())
            .templateStatus(item.getTemplateStatus())
            .channelId(item.getChannelId())
            .templateDesc(mapper.readTree(item.getTemplateDesc()))
            .templateCode(item.getTemplateCode())
            .templateName(item.getTemplateName())
            .templateType(item.getTemplateType())
            .build();
    }

    public MessageTemplate convert(MessageTemplateVo item) {
        var result = new MessageTemplate();

        var operateTime = LocalDateTime.now();
        result.setCreatedTime(operateTime);
        result.setUpdatedTime(operateTime);
        result.setTenantId(item.getTenantId());
        result.setDeletedFlag(TZeroConstants.NORMAL);

        result.setChannelId(item.getChannelId());
        result.setTemplateDesc(item.getTemplateDesc().toString());
        result.setTemplateName(item.getTemplateName());
        result.setTemplateType(item.getTemplateType());

        result.setTemplateCode(
            StringUtils.isBlank(item.getTemplateCode()) ? UUIDUtils.getUUID() : item.getTemplateCode());
        return result;
    }

    public MessageTemplate convert(MessageTemplateVo item, MessageTemplate result) {
        var operateTime = LocalDateTime.now();
        result.setUpdatedTime(operateTime);

        result.setTemplateDesc(
            ObjectUtils.isEmpty(item.getTemplateDesc()) ? result.getTemplateDesc() : item.getTemplateDesc().toString());
        result.setTemplateName(
            StringUtils.isBlank(item.getTemplateName()) ? result.getTemplateName() : item.getTemplateName());
        return result;
    }

}
