package com.t.zero.message.platform.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.vo.request.MessageTemplateVo;

public interface MessageTemplateService {

    Page<MessageTemplateVo> list(CommonParams params, Integer tenantId, Integer currentPage, Integer pageSize);

    Page<MessageTemplateVo> getByChannel(CommonParams params, Integer channelId, Integer currentPage, Integer pageSize);

    MessageTemplateVo get(CommonParams params, Integer templateId) throws JsonMappingException, JsonProcessingException;

    Integer save(CommonParams params, MessageTemplateVo messageTemplateVo);

    Integer modify(CommonParams params, MessageTemplateVo messageTemplateVo);

    Integer delete(CommonParams params, Integer templateId);

}
