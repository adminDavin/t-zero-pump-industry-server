package com.t.zero.message.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.t.zero.message.platform.model.auto.MessageScene;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.message.platform.constant.messageConstant;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "消息场景")
@RequestMapping("/message/scene")
public interface MessageSceneController {

    @ApiOperation(value = "查看消息场景列表")
    @PostMapping(value = "/list", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> list(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody MessageInstanceFilters filters,
                                @RequestParam(value = RequestConstants.CURRENT_PAGE, required = false) Integer currentPage,
                                @RequestParam(value = RequestConstants.PAGE_SIZE, required = false) Integer pageSize);

    @ApiOperation(value = "新增场景配置")
    @PostMapping(value = "/save", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> save(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                @RequestBody MessageScene channelDefinedVo);

    @ApiOperation(value = "修改场景配置")
    @PostMapping(value = "/modify", produces = RequestConstants.CONTENT_TYPE_JSON)
    ResponseResult<Object> modify(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestBody MessageScene channelDefinedVo);

    @ApiOperation(value = "删除场景配置")
    @GetMapping(value = "/delete")
    ResponseResult<Object> delete(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                  @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                  @RequestParam(value = messageConstant.SCENE_ID, required = true) Integer sceneId);


    @ApiOperation(value = "禁用场景消息")
    @GetMapping(value = "/forbit")
    ResponseResult<Object> forbitScene(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                       @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                       @RequestParam(value = messageConstant.SCENE_ID, required = true) Integer sceneId);

    @ApiOperation(value = "启用场景消息")
    @GetMapping(value = "/enable")
    ResponseResult<Object> enableScene(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                       @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId,
                                       @RequestParam(value = messageConstant.SCENE_ID, required = true) Integer sceneId);

    @ApiOperation(value = "初始化消息场景、消息模版和消息渠道")
    @GetMapping(value = "/init/message/date")
    ResponseResult<Object> initMessageDate(@RequestHeader(value = RequestConstants.Header.TENANT_ID) Integer tenantId,
                                           @RequestHeader(value = RequestConstants.Header.USER_ID) Integer userId);

}
