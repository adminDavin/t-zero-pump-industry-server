package com.t.zero.message.platform.controller;

import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.message.platform.constant.messageConstant;
import com.t.zero.message.platform.vo.request.ChannelDefinedVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

//@Api(value = "渠道定义")
@RequestMapping("/channel")
public interface ChannelDefinedController {

    @ApiOperation(value = "查看渠道配置")
    @GetMapping(value = "/list")
    ResponseResult<Object> list(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId);

    @ApiOperation(value = "禁用渠道消息")
    @GetMapping(value = "/forbit")
    ResponseResult<Object> forbitChannel(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                         @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                         @RequestParam(value = messageConstant.CHANNEL_ID, required = true) Integer channelId);

    @ApiOperation(value = "启用渠道消息")
    @GetMapping(value = "/enable")
    ResponseResult<Object> enableChannel(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                         @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                         @RequestParam(value = messageConstant.CHANNEL_ID, required = true) Integer channelId);

    @ApiOperation(value = "跟随默认渠道配置")
    @GetMapping(value = "/follow")
    ResponseResult<Object> followChannel(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                         @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                         @RequestParam(value = messageConstant.CHANNEL_ID, required = true) Integer channelId);

    @ApiOperation(value = "查看默认渠道配置")
    @GetMapping(value = "/list/default")
    ResponseResult<Object> listDefault(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                       @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId);

    @ApiOperation(value = "查看默认渠道配置详情")
    @GetMapping(value = "/get")
    ResponseResult<Object> get(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                               @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                               @RequestParam(value = messageConstant.CHANNEL_ID, required = true) Integer channelId);

    @ApiOperation(value = "新增渠道配置")
    @PostMapping(value = "/save", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> save(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody ChannelDefinedVo channelDefinedVo);

    @ApiOperation(value = "修改渠道配置")
    @PostMapping(value = "/modify", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> modify(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestBody ChannelDefinedVo channelDefinedVo);

    @ApiOperation(value = "删除渠道配置")
    @GetMapping(value = "/delete")
    ResponseResult<Object> delete(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestParam(value = messageConstant.CHANNEL_ID, required = true) Integer channelId);

//    @ApiOperation(value = "启用渠道消息")
//    @GetMapping(value = "/test")
//    ResponseResult<Object> enableChannel() throws JsonProcessingException, Exception;
}
