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
import com.t.zero.message.platform.model.auto.ChannelDefined;
import com.t.zero.message.platform.model.auto.ChannelInstance;
import com.t.zero.message.platform.vo.request.ChannelDefinedVo;

@Component
public class ChannelDefinedConverter {
	
	@Autowired
	private ObjectMapper mapper;
	
	public List<ChannelDefinedVo> convert(List<ChannelDefined> items) {
		return items.stream().map(item -> {
			return ChannelDefinedVo.builder()
					.createdTime(item.getCreatedTime())
					.createdUserId(item.getCreatedUserId())
					.id(item.getId())
					.tenantId(item.getTenantId())
					.updatedTime(item.getUpdatedTime())
					.updatedUserId(item.getUpdatedUserId())
					.channelCode(item.getChannelCode())
					.channelDefault(item.getChannelDefault())
					.channelName(item.getChannelName())
					.channelType(item.getChannelType())
					.channelStatus(item.getChannelStatus())
					.build();
		})
		.filter(item -> ObjectUtils.isNotEmpty(item))
		.collect(Collectors.toList());
	}
	
	
	public ChannelDefinedVo convert(ChannelDefined item) throws JsonMappingException, JsonProcessingException {
		return ChannelDefinedVo.builder()
				.createdTime(item.getCreatedTime())
				.createdUserId(item.getCreatedUserId())
				.id(item.getId())
				.tenantId(item.getTenantId())
				.updatedTime(item.getUpdatedTime())
				.updatedUserId(item.getUpdatedUserId())
				.channelCode(item.getChannelCode())
				.channelDefault(item.getChannelDefault())
				.channelName(item.getChannelName())
				.channelType(item.getChannelType())
				.channelStatus(item.getChannelStatus())
				.channelDesc(mapper.readTree(item.getChannelDesc()))
				.build();
	}
	
	public ChannelDefined convert(ChannelDefinedVo item) {
		var result = new ChannelDefined();

		var operateTime = LocalDateTime.now();
		result.setCreatedTime(operateTime);
		result.setUpdatedTime(operateTime);
		result.setDeletedFlag(TZeroConstants.NORMAL);
		 
		result.setTenantId(item.getTenantId());
		result.setChannelDesc(item.getChannelDesc().toString());
		result.setChannelName(item.getChannelName());
		result.setChannelType(item.getChannelType());
		
		result.setChannelCode(StringUtils.isBlank(item.getChannelCode())? UUIDUtils.getUUID(): item.getChannelCode());
		result.setChannelDefault(ObjectUtils.isEmpty(item.getChannelDefault())? Byte.valueOf(TZeroConstants.NORMAL): item.getChannelDefault());
		result.setChannelStatus(ObjectUtils.isEmpty(item.getChannelStatus())? Byte.valueOf(TZeroConstants.NORMAL): item.getChannelStatus());
		
		return result;
	}

	
	public ChannelDefined convert(ChannelDefinedVo item, ChannelDefined result) {
		var operateTime = LocalDateTime.now();
		result.setUpdatedTime(operateTime);

		result.setChannelDesc(ObjectUtils.isEmpty(item.getChannelDesc())? result.getChannelDesc(): item.getChannelDesc().toString());
		result.setChannelName(StringUtils.isBlank(item.getChannelName())? result.getChannelName(): item.getChannelName());
		return result;
	}
	
	public ChannelInstance convertChannelInstance(ChannelDefined channel) {
		var operateTime = LocalDateTime.now();
		var instance = new ChannelInstance();
		instance.setChannelCode(channel.getChannelCode());
		instance.setChannelDefault(Byte.valueOf(TZeroConstants.NORMAL));
		instance.setChannelId(channel.getId());
		instance.setCreatedTime(operateTime);
		instance.setDeletedFlag(TZeroConstants.NORMAL);
		instance.setUpdatedTime(operateTime);
		instance.setChannelType(channel.getChannelType());
		return instance;
	}
	
	
	

}
