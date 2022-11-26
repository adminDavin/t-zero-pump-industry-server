package com.t.zero.message.platform.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;

public interface MessageInstanceService {
	
	Page<MessageInstanceVo> list(CommonParams params, MessageInstanceFilters filters, Integer currentPage, Integer pageSize);
	
	MessageInstanceVo get(CommonParams params, Integer instanceId) throws JsonMappingException, JsonProcessingException;
	
	Integer save(CommonParams params, MessageInstanceVo messageTemplateVo);
	
	Integer modify(CommonParams params, MessageInstanceVo messageTemplateVo);
	
	Integer delete(CommonParams params, Integer instanceId);

	Integer deleteList(CommonParams params, MessageInstanceFilters filters);

	Integer modifyList(CommonParams params, MessageInstanceVo channelDefinedVo);
}
