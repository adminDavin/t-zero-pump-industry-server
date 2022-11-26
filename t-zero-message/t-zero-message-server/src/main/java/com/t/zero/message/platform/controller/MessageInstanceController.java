package com.t.zero.message.platform.controller;

import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.message.platform.constant.messageConstant;

@Api(value = "消息实例")
@RequestMapping("/message/instance")
public interface MessageInstanceController {

    @ApiOperation(value = "查看消息列表")
    @PostMapping(value = "/list", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> list(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody MessageInstanceFilters filters,
                                @RequestParam(value = RequestConstants.CURRENT_PAGE, required = false) Integer currentPage,
                                @RequestParam(value = RequestConstants.PAGE_SIZE, required = false) Integer pageSize);

    @ApiOperation(value = "查看消息详情")
    @GetMapping(value = "/get")
    ResponseResult<Object> get(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                               @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                               @RequestParam(value = messageConstant.INSTANCE_ID, required = true) Integer instanceId);

    @ApiOperation(value = "新增消息")
    @PostMapping(value = "/save", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> save(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody MessageInstanceVo channelDefinedVo);

    @ApiOperation(value = "修改消息")
    @PostMapping(value = "/modify", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> modify(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestBody MessageInstanceVo channelDefinedVo);

    @ApiOperation(value = "批量修改消息的已读未读")
    @PostMapping(value = "/modify/list", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> modifyList(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                      @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                      @RequestBody MessageInstanceVo channelDefinedVo);

    @ApiOperation(value = "删除消息")
    @GetMapping(value = "/delete")
    ResponseResult<Object> delete(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestParam(value = messageConstant.INSTANCE_ID, required = true) Integer instanceId);

    @ApiOperation(value = "批量删除消息")
    @PostMapping(value = "/delete/list", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> deleteList(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                      @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                      @RequestBody MessageInstanceFilters filters);

}
