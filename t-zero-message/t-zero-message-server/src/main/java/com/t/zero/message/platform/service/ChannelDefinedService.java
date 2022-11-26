package com.t.zero.message.platform.service;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.vo.request.ChannelDefinedVo;

public interface ChannelDefinedService {

	List<ChannelDefinedVo> list(CommonParams params, Integer tenantId, Integer userId);

	Integer forbitChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId);

	Integer enableChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId);

	Integer followChannel(CommonParams params, Integer tenantId, Integer userId, Integer channelId);

	List<ChannelDefinedVo> list(CommonParams params, Integer tenantId);

	ChannelDefinedVo get(CommonParams params, Integer channelId) throws JsonMappingException, JsonProcessingException;

	Integer save(CommonParams params, ChannelDefinedVo channelDefinedVo);

	Integer modify(CommonParams params, ChannelDefinedVo channelDefinedVo);

	Integer delete(CommonParams params, Integer channelId);

    void initDate(Integer tendId, CommonParams params);
}
