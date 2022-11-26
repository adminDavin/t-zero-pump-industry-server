package com.t.zero.message.platform.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.t.zero.message.platform.dao.auto.MessageTemplateMapper;
import com.t.zero.message.platform.model.auto.*;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.converter.ChannelDefinedConverter;
import com.t.zero.message.platform.dao.auto.ChannelDefinedMapper;
import com.t.zero.message.platform.dao.auto.ChannelInstanceMapper;
import com.t.zero.message.platform.service.ChannelDefinedService;
import com.t.zero.message.platform.vo.request.ChannelDefinedVo;

@Service
public class ChannelDefinedServiceImpl implements ChannelDefinedService {
	
	
	@Autowired
	private ChannelDefinedMapper channelDefinedMapper;
	
	@Autowired
	private ChannelInstanceMapper channelInstanceMapper;
	
	@Autowired
	private ChannelDefinedConverter channelDefinedConverter;

	@Autowired
	private MessageTemplateMapper messageTemplateMapper;
	
	
	@Override
	public List<ChannelDefinedVo> list(CommonParams params, Integer tenantId, Integer userId) {
		var example = new ChannelDefinedExample();
		example.createCriteria().andTenantIdEqualTo(tenantId).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
		var result = channelDefinedConverter.convert(channelDefinedMapper.selectByExample(example));
		
		var insExample = new ChannelInstanceExample();
		insExample.createCriteria().andUserIdEqualTo(userId).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
		var instances = channelInstanceMapper.selectByExample(insExample);
		
		var instanceMap = instances.stream().collect(Collectors.toMap(ChannelInstance::getChannelId, item -> item));
		
		for (var item: result) {
			var selfChannel = instanceMap.get(item.getId());
			if (ObjectUtils.isNotEmpty(selfChannel)) {
				item.setUserId(selfChannel.getUserId());
				item.setChannelStatus(selfChannel.getChannelStatus());
			}
		}
		return result;
	}
	
	@Override
	public Integer forbitChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId) {
		var insExample = new ChannelInstanceExample();
		insExample.createCriteria().andUserIdEqualTo(userId).andChannelIdEqualTo(channelId);
		var instances = channelInstanceMapper.selectByExample(insExample);
		
		if (CollectionUtils.isEmpty(instances)) {
			var instance = channelDefinedConverter.convertChannelInstance(channelDefinedMapper.selectByPrimaryKey(channelId));
			instance.setChannelStatus(Byte.valueOf(TZeroConstants.ABNORMAL));
			instance.setChannelDefault(Byte.valueOf(TZeroConstants.ABNORMAL));
			instance.setCreatedUserId(params.getUserId());
			instance.setUpdatedUserId(params.getUserId());
			instance.setUserId(userId);
			channelInstanceMapper.insert(instance);
			
		} else {
			var instance = instances.get(0);
			var operateTime = LocalDateTime.now();
			
			instance.setUpdatedTime(operateTime);
			instance.setChannelStatus(Byte.valueOf(TZeroConstants.ABNORMAL));
			instance.setChannelDefault(Byte.valueOf(TZeroConstants.ABNORMAL));
			instance.setUpdatedUserId(params.getUserId());
			channelInstanceMapper.updateByPrimaryKeySelective(instance);
		}
		return userId;
	}	
	
	@Override
	public Integer enableChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId) {
		var insExample = new ChannelInstanceExample();
		insExample.createCriteria().andUserIdEqualTo(userId).andChannelIdEqualTo(channelId);
		var instances = channelInstanceMapper.selectByExample(insExample);
		
		if (CollectionUtils.isEmpty(instances)) {
			var instance = channelDefinedConverter.convertChannelInstance(channelDefinedMapper.selectByPrimaryKey(channelId));
			instance.setChannelStatus(Byte.valueOf(TZeroConstants.NORMAL));
			instance.setChannelDefault(Byte.valueOf(TZeroConstants.NORMAL));
			instance.setCreatedUserId(params.getUserId());
			instance.setUpdatedUserId(params.getUserId());
			instance.setUserId(userId);
			channelInstanceMapper.insert(instance);
			
		} else {
			var instance = instances.get(0);
			var operateTime = LocalDateTime.now();
			instance.setUpdatedTime(operateTime);
			instance.setChannelStatus(Byte.valueOf(TZeroConstants.NORMAL));
			instance.setChannelDefault(Byte.valueOf(TZeroConstants.NORMAL));
			instance.setUpdatedUserId(params.getUserId());
			channelInstanceMapper.updateByPrimaryKeySelective(instance);
		}
		return userId;
	}
	
	@Override
	public Integer followChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId) {
		var insExample = new ChannelInstanceExample();
		insExample.createCriteria().andUserIdEqualTo(userId).andChannelIdEqualTo(channelId);
		return channelInstanceMapper.deleteByExample(insExample);
	}
	
	
	@Override
	public List<ChannelDefinedVo> list(CommonParams params, Integer tenantId) {
		var example = new ChannelDefinedExample();
		example.createCriteria().andTenantIdEqualTo(tenantId);
		return channelDefinedConverter.convert(channelDefinedMapper.selectByExample(example));
	}
	
	@Override
	public ChannelDefinedVo get(CommonParams params, Integer channelId) throws JsonMappingException, JsonProcessingException {
		return channelDefinedConverter.convert(channelDefinedMapper.selectByPrimaryKey(channelId));
	}
	
	
	@Override
	public Integer save(CommonParams params, ChannelDefinedVo channelDefinedVo) {
		var record = channelDefinedConverter.convert(channelDefinedVo);
		record.setCreatedUserId(params.getUserId());
		record.setUpdatedUserId(params.getUserId());
		record.setTenantId(params.getTenantId());
		return channelDefinedMapper.insert(record);
	}
	
	@Override
	public Integer modify(CommonParams params, ChannelDefinedVo channelDefinedVo) {
		var record = channelDefinedConverter.convert(channelDefinedVo, channelDefinedMapper.selectByPrimaryKey(channelDefinedVo.getId()));
		record.setUpdatedUserId(params.getUserId());
		return channelDefinedMapper.updateByPrimaryKeyWithBLOBs(record);
	}
	
	
	@Override
	public Integer delete(CommonParams params, Integer channelId) {
		var record = channelDefinedMapper.selectByPrimaryKey(channelId);
		record.setDeletedFlag(TZeroConstants.ABNORMAL);
		record.setUpdatedTime(LocalDateTime.now());
		record.setUpdatedUserId(params.getUserId());
		return channelDefinedMapper.updateByPrimaryKeySelective(record);
	}
    /*
     *功能描述：新建租户初始化数据
     * @author mjy
     * @date 2021/9/3 4:20 下午
     */
	@Override
	public void initDate(Integer tendId, CommonParams params) {
		ChannelDefinedExample channelDefinedExample = new ChannelDefinedExample();
		channelDefinedExample.createCriteria().andTenantIdEqualTo(tendId).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
		List<ChannelDefined>  channelDefineds = channelDefinedMapper.selectByExample(channelDefinedExample);
		var channelIds = channelDefineds.stream().map(ChannelDefined::getId).collect(Collectors.toList());
		MessageTemplateExample messageTemplateExample = new MessageTemplateExample();
		messageTemplateExample.createCriteria().andChannelIdIn(channelIds).andDeletedFlagEqualTo(TZeroConstants.NORMAL);
		List<MessageTemplate> messageTemplates = 	messageTemplateMapper.selectByExample(messageTemplateExample);
		Map<Integer,List<MessageTemplate>> templeteMap = new HashMap<>();
		messageTemplates.forEach(item->{
			List<MessageTemplate> templates = new ArrayList<>();
			if(templeteMap.get(item.getChannelId())!=null){
				templates = templeteMap.get(item.getChannelId());
			}
			templates.add(item);
			templeteMap.put(item.getChannelId(),templates);
		});
		var operateTime = LocalDateTime.now();
		channelDefineds.forEach(item->{
			item.setCreatedTime(operateTime);
			item.setUpdatedTime(operateTime);
			item.setCreatedUserId(params.getUserId());
			item.setUpdatedUserId(params.getUserId());
			item.setId(null);
			List<MessageTemplate> templateList = templeteMap.get(item.getId());
			Integer channelId = channelDefinedMapper.insert(item);
			if(templateList!=null){
				templateList.forEach(p->{
					p.setCreatedTime(operateTime);
					p.setUpdatedTime(operateTime);
					p.setCreatedUserId(params.getUserId());
					p.setUpdatedUserId(params.getUserId());
					p.setChannelId(channelId);
					p.setId(null);
					messageTemplateMapper.insert(p);
				});
			}


		});

	}
}
