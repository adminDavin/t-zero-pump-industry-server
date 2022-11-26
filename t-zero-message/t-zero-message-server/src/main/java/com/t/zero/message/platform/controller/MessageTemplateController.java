package com.t.zero.message.platform.controller;

import com.t.zero.message.platform.vo.request.MessageTemplateVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.message.platform.constant.messageConstant;

@Api(value = "消息模版")
@RequestMapping("/message/template")
public interface MessageTemplateController {

    @ApiOperation(value = "查看消息模版列表")
    @GetMapping(value = "/list")
    ResponseResult<Object> list(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestParam(value = RequestConstants.CURRENT_PAGE, required = false) Integer currentPage,
                                @RequestParam(value = RequestConstants.PAGE_SIZE, required = false) Integer pageSize);

    @ApiOperation(value = "查看模板详情")
    @GetMapping(value = "/get")
    ResponseResult<Object> get(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                               @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                               @RequestParam(value = messageConstant.TEMPLATE_ID, required = true) Integer templateId);

    @ApiOperation(value = "新增消息模板")
    @PostMapping(value = "/save", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> save(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody MessageTemplateVo channelDefinedVo);

    @ApiOperation(value = "修改消息模板")
    @PostMapping(value = "/modify", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> modify(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestBody MessageTemplateVo channelDefinedVo);

    @ApiOperation(value = "删除消息模板")
    @GetMapping(value = "/delete")
    ResponseResult<Object> delete(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestParam(value = messageConstant.TEMPLATE_ID, required = true) Integer templateId);
}
