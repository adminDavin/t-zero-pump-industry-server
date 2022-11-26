package com.t.zero.message.platform.converter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.message.platform.model.auto.MessageInstance;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;


@Component
public class MessageInstanceConverter {
	@Autowired
	private ObjectMapper mapper;
	
	public List<MessageInstanceVo> convert(List<MessageInstance> items) {
		ObjectMapper mapper = new ObjectMapper();
		return items.stream().map(item -> {
			try {
				return MessageInstanceVo.builder()
						.createdTime(item.getCreatedTime())
						.createdUserId(item.getCreatedUserId())
						.updatedTime(item.getUpdatedTime())
						.updatedUserId(item.getUpdatedUserId())
						.id(item.getId())
						.businessType(item.getBusinessType())
						.channelCode(item.getChannelCode())
						.id(item.getId())
						.templateId(item.getTemplateId())
						.productId(item.getProductId())
						.sendStatus(item.getSendStatus())
						.readedFlag(item.getReadedFlag())
						.userId(item.getUserId())
						.messageContent( mapper.readTree(item.getMessageContent()))
						.build();
			} catch (JsonProcessingException e) {
				return null;
			}
		})
		.filter(item -> ObjectUtils.isNotEmpty(item))
		.collect(Collectors.toList());
	}
	
	public MessageInstanceVo convert(MessageInstance item) throws JsonMappingException, JsonProcessingException {
		return MessageInstanceVo.builder()
				.createdTime(item.getCreatedTime())
				.createdUserId(item.getCreatedUserId())
				.updatedTime(item.getUpdatedTime())
				.updatedUserId(item.getUpdatedUserId())
				.id(item.getId())
				.businessType(item.getBusinessType())
				.channelCode(item.getChannelCode())
				.id(item.getId())
				.productId(item.getProductId())
				.sendStatus(item.getSendStatus())
				.readedFlag(item.getReadedFlag())
				.templateId(item.getTemplateId())
				.userId(item.getUserId())
				.messageContent(mapper.readTree(item.getMessageContent()))
				.build();
	}

	
	public MessageInstance convert(MessageInstanceVo item) {
		var result = new MessageInstance();

		var operateTime = LocalDateTime.now();
		result.setCreatedTime(operateTime);
		result.setUpdatedTime(operateTime);
		result.setDeletedFlag(TZeroConstants.NORMAL);
		
		result.setBusinessType(item.getBusinessType());
		result.setChannelCode(item.getChannelCode());
		result.setMessageContent(item.getMessageContent().toString());
		result.setProductId(item.getProductId());
		result.setTemplateId(item.getTemplateId());
		result.setReadedFlag(ObjectUtils.isEmpty(item.getReadedFlag())? Byte.valueOf(TZeroConstants.ABNORMAL): item.getReadedFlag());
		result.setSendStatus(ObjectUtils.isEmpty(item.getSendStatus())? Byte.valueOf(TZeroConstants.ABNORMAL): item.getSendStatus());
		result.setUserId(item.getUserId());
		return result;
	}

	
	public MessageInstance convert(MessageInstanceVo item, MessageInstance result) {
		var operateTime = LocalDateTime.now();
		result.setUpdatedTime(operateTime);

		result.setReadedFlag(ObjectUtils.isEmpty(item.getReadedFlag())? Byte.valueOf(TZeroConstants.ABNORMAL): item.getReadedFlag());
		result.setSendStatus(ObjectUtils.isEmpty(item.getSendStatus())? Byte.valueOf(TZeroConstants.ABNORMAL): item.getSendStatus());
		return result;
	}

}
