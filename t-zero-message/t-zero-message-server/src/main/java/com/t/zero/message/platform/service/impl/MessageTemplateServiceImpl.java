package com.t.zero.message.platform.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.message.platform.converter.MessageTemplateConverter;
import com.t.zero.message.platform.dao.auto.MessageTemplateMapper;
import com.t.zero.message.platform.dao.manual.ManualMessageTemplateMapper;
import com.t.zero.message.platform.service.MessageTemplateService;
import com.t.zero.message.platform.vo.request.MessageTemplateVo;

@Service
public class MessageTemplateServiceImpl implements MessageTemplateService {

    @Autowired
    private MessageTemplateMapper messageTemplateMapper;

    @Autowired
    private ManualMessageTemplateMapper manualMessageTemplateMapper;

    @Autowired
    private MessageTemplateConverter messageTemplateConverter;

    @Override
    public Page<MessageTemplateVo> list(CommonParams params, Integer tenantId, Integer currentPage, Integer pageSize) {
        Page<MessageTemplateVo> page = Page.build(currentPage, pageSize);
        page.setTotalCount(manualMessageTemplateMapper.selectList(tenantId));
        if (page.getTotalCount() > 0) {
            var selected =
                manualMessageTemplateMapper.selectListWithPage(tenantId, page.getOffset(), page.getPageSize());
            page.setList(messageTemplateConverter.convert(selected));
        } else {
            page.setList(new ArrayList<>(0));
        }
        return page;
    }

    @Override
    public Page<MessageTemplateVo> getByChannel(CommonParams params, Integer channelId, Integer currentPage,
        Integer pageSize) {
        Page<MessageTemplateVo> page = Page.build(currentPage, pageSize);
        page.setTotalCount(manualMessageTemplateMapper.selectListByChannel(params.getTenantId(), params.getUserIdInt(), channelId));
        if (page.getTotalCount() > 0) {
            var selected =
                manualMessageTemplateMapper.selectListByChannelWithPage(params.getTenantId(), params.getUserIdInt(), channelId, page.getOffset(), page.getPageSize());
            page.setList(messageTemplateConverter.convert(selected));
        } else {
            page.setList(new ArrayList<>(0));
        }
        return page;
    }

    @Override
    public MessageTemplateVo get(CommonParams params, Integer templateId)
        throws JsonMappingException, JsonProcessingException {
        return messageTemplateConverter.convert(messageTemplateMapper.selectByPrimaryKey(templateId));
    }

    @Override
    public Integer save(CommonParams params, MessageTemplateVo messageTemplateVo) {
        var record = messageTemplateConverter.convert(messageTemplateVo);
        record.setCreatedUserId(params.getUserId());
        record.setUpdatedUserId(params.getUserId());
        record.setTenantId(params.getTenantId());
        return messageTemplateMapper.insert(record);
    }

    @Override
    public Integer modify(CommonParams params, MessageTemplateVo messageTemplateVo) {
        var record = messageTemplateConverter.convert(messageTemplateVo,
            messageTemplateMapper.selectByPrimaryKey(messageTemplateVo.getId()));
        record.setUpdatedUserId(params.getUserId());
        return messageTemplateMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public Integer delete(CommonParams params, Integer templateId) {
        var record = messageTemplateMapper.selectByPrimaryKey(templateId);
        record.setDeletedFlag(TZeroConstants.ABNORMAL);
        record.setUpdatedTime(LocalDateTime.now());
        record.setUpdatedUserId(params.getUserId());
        return messageTemplateMapper.updateByPrimaryKeySelective(record);
    }

}
