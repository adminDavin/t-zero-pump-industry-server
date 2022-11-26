package com.t.zero.message.platform.controller.impl;

import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.message.platform.controller.MessageTemplateController;
import com.t.zero.message.platform.service.MessageTemplateService;
import com.t.zero.message.platform.vo.request.MessageTemplateVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.t.zero.message.platform.constant.TMessageConstant.LISTDEFAULT;
import static com.t.zero.message.platform.constant.TMessageConstant.FORBITCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.FOLLOWCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.ENABLECHANNEL;
import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.*;



@RestController
public class MessageTemplateControllerImpl extends TZeroBasicController implements MessageTemplateController {

    public MessageTemplateControllerImpl(ResponseExceptionHandler responseExceptionHandler, MessageTemplateService messageTemplateService) {
        super(responseExceptionHandler);
        this.messageTemplateService = messageTemplateService;
    }
    private final String MESSAGE_TEMPLATE_CONTROLLER_IMPL = "MESSAGE_TEMPLATE_CONTROLLER_IMPL.%s failed";

    private final MessageTemplateService messageTemplateService;

    @Override
    public ResponseResult<Object> list(Integer tenantId, Integer userId, Integer currentPage, Integer pageSize) {
        try {
            return ResponseResult.ok(messageTemplateService.list(CommonParams.build(tenantId, userId), tenantId, currentPage, pageSize));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, LIST), e);
        }
    }

//2021.11.5 11:30 zzz
//    public ResponseResult<Object> getByChannel(Integer tenantId, Integer userId, Integer channelId, Integer currentPage, Integer pageSize) {
//        try {
//            var params = CommonParams.build(tenantId, userId);
//            return ResponseResult.ok(messageTemplateService.getByChannel(params, channelId, currentPage, pageSize));
//        } catch (Exception e) {
//            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, GETBYCHANNEL), e);
//        }
//    }

    @Override
    public ResponseResult<Object> get(Integer tenantId, Integer userId, Integer templateId) {
        try {
            return ResponseResult.ok(messageTemplateService.get(CommonParams.build(tenantId, userId), templateId));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, GET), e);
        }
    }

    @Override
    public ResponseResult<Object> save(Integer tenantId, Integer userId,
        @RequestBody MessageTemplateVo channelDefinedVo) {
        try {
            return ResponseResult.ok(messageTemplateService.save(CommonParams.build(tenantId, userId), channelDefinedVo));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, SAVE), e);
        }
    }

    @Override
    public ResponseResult<Object> modify(Integer tenantId, Integer userId,
        @RequestBody MessageTemplateVo channelDefinedVo) {
        try {
            return ResponseResult.ok(messageTemplateService.modify(CommonParams.build(tenantId, userId), channelDefinedVo));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, MODIFY), e);
        }
    }
    
    @Override
    public ResponseResult<Object> delete(Integer tenantId, Integer userId, Integer templateId) {
        try {
            return ResponseResult.ok(messageTemplateService.delete(CommonParams.build(tenantId, userId), templateId));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format(MESSAGE_TEMPLATE_CONTROLLER_IMPL, DELETE), e);
        }
    }
}
