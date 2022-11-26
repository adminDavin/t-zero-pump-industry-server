package com.t.zero.message.platform.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.t.zero.message.platform.model.auto.MessageInstance;
import com.t.zero.message.platform.model.auto.MessageInstanceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.converter.MessageInstanceConverter;
import com.t.zero.message.platform.dao.auto.MessageInstanceMapper;
import com.t.zero.message.platform.dao.manual.ManualMessageInstanceMapper;
import com.t.zero.message.platform.service.MessageInstanceService;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;

@Service
public class MessageInstanceServiceImpl implements MessageInstanceService {

	@Autowired
	private MessageInstanceMapper messageInstanceMapper;
	
	@Autowired
	private ManualMessageInstanceMapper manualMessageInstanceMapper;
	
	@Autowired
	private MessageInstanceConverter messageInstanceConverter;
	
	@Override
	public Page<MessageInstanceVo> list(CommonParams params, MessageInstanceFilters filters, Integer currentPage, Integer pageSize) {
		Page<MessageInstanceVo> page = Page.build(currentPage, pageSize);
		filters.setUserId(params.getUserIdInt());
		page.setTotalCount(manualMessageInstanceMapper.selectList(filters));
		if (page.getTotalCount() > 0) {
			var selected = manualMessageInstanceMapper.selectListWithPage(filters, page.getOffset(), page.getPageSize());
			page.setList(messageInstanceConverter.convert(selected));
		} else {
			page.setList(new ArrayList<>(0));
		}
		return page;
	}
	
	@Override
	public MessageInstanceVo get(CommonParams params, Integer instanceId) throws JsonMappingException, JsonProcessingException {
		return messageInstanceConverter.convert(messageInstanceMapper.selectByPrimaryKey(instanceId));
	}
	
	
	@Override
	public Integer save(CommonParams params, MessageInstanceVo messageTemplateVo) {
		var record = messageInstanceConverter.convert(messageTemplateVo);
		record.setCreatedUserId(params.getUserId());
		record.setUpdatedUserId(params.getUserId());
		return messageInstanceMapper.insert(record);
	}
	
	@Override
	public Integer modify(CommonParams params, MessageInstanceVo messageTemplateVo) {
		var record = messageInstanceConverter.convert(messageTemplateVo, messageInstanceMapper.selectByPrimaryKey(messageTemplateVo.getId()));
		record.setUpdatedUserId(params.getUserId());
		return messageInstanceMapper.updateByPrimaryKeyWithBLOBs(record);
	}
	
	@Override
	public Integer delete(CommonParams params, Integer instanceId) {
		var record = messageInstanceMapper.selectByPrimaryKey(instanceId);
		record.setDeletedFlag(TZeroConstants.ABNORMAL);
		record.setUpdatedTime(LocalDateTime.now());
		record.setUpdatedUserId(params.getUserId());
		return messageInstanceMapper.updateByPrimaryKeySelective(record);
	}
     /*
      *功能描述 批量删除消息
      * @author mjy
      * @date 2021/8/5 17:07
      */
	@Override
	public Integer deleteList(CommonParams params, MessageInstanceFilters filters) {
		if(filters.getMessageIds()!=null && filters.getMessageIds().size()>0){
			MessageInstance record = new MessageInstance();
			record.setDeletedFlag(TZeroConstants.ABNORMAL);
			record.setUpdatedTime(LocalDateTime.now());
			record.setUpdatedUserId(params.getUserId());
			MessageInstanceExample example = new MessageInstanceExample();
			example.createCriteria().andIdIn(filters.getMessageIds());
			return  messageInstanceMapper.updateByExampleSelective(record,example);
		}

		return 0;
	}
	 /*
	  *功能描述 批量修改消息的已读未读
	  * @author mjy
	  * @date 2021/8/5 17:07
	  */
	@Override
	public Integer modifyList(CommonParams params, MessageInstanceVo channelDefinedVo) {
		if(channelDefinedVo.getMessageIds()!=null && channelDefinedVo.getMessageIds().size()>0){
			MessageInstance record = new MessageInstance();
			record.setReadedFlag(channelDefinedVo.getReadedFlag());
			record.setUpdatedTime(LocalDateTime.now());
			record.setUpdatedUserId(params.getUserId());
			MessageInstanceExample example = new MessageInstanceExample();
			example.createCriteria().andIdIn(channelDefinedVo.getMessageIds());
			return  messageInstanceMapper.updateByExampleSelective(record,example);
		}

		return 0;
	}
}
