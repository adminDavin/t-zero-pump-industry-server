package com.t.zero.message.platform.controller.impl;

import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.message.platform.controller.MessageInstanceController;
import com.t.zero.message.platform.service.MessageInstanceService;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;
import com.t.zero.message.platform.vo.request.MessageInstanceVo;
import org.springframework.web.bind.annotation.RestController;

import static com.t.zero.message.platform.constant.TMessageConstant.LISTDEFAULT;
import static com.t.zero.message.platform.constant.TMessageConstant.FORBITCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.FOLLOWCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.ENABLECHANNEL;
import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.*;

import static com.t.zero.message.platform.constant.TMessageConstant.DELETELIST;
import static com.t.zero.message.platform.constant.TMessageConstant.MODIFYLIST;


@RestController
public class MessageInstanceControllerImpl extends TZeroBasicController implements MessageInstanceController {
	public MessageInstanceControllerImpl(ResponseExceptionHandler responseExceptionHandler, MessageInstanceService messageInstanceService) {
		super(responseExceptionHandler);
		this.messageInstanceService = messageInstanceService;
	}
	private final String MESSAGE_INSTANCE_CONTROLLER_IMPL = "MESSAGE_INSTANCE_CONTROLLER_IMPL.%s failed";
	private final MessageInstanceService messageInstanceService;

	@Override
	public ResponseResult<Object> list(Integer tenantId, Integer userId,MessageInstanceFilters filters, Integer currentPage, Integer pageSize) {
		try {
			return ResponseResult.ok(messageInstanceService.list(CommonParams.build(tenantId, userId), filters, currentPage, pageSize));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, LIST), e);
		}
	}
	
	@Override
	public ResponseResult<Object> get(Integer tenantId, Integer userId,  Integer instanceId) {
		try {
			return ResponseResult.ok(messageInstanceService.get(CommonParams.build(tenantId, userId), instanceId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, GET), e);
		}
	}
	
	@Override
	public ResponseResult<Object> save(Integer tenantId, Integer userId,MessageInstanceVo channelDefinedVo) {
		try {
			return ResponseResult.ok(messageInstanceService.save(CommonParams.build(tenantId, userId), channelDefinedVo));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, SAVE), e);
		}
	}

	@Override
	public ResponseResult<Object> modify(Integer tenantId, Integer userId,MessageInstanceVo channelDefinedVo) {
		try {
			return ResponseResult.ok(messageInstanceService.modify(CommonParams.build(tenantId, userId), channelDefinedVo));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, MODIFY), e);
		}
	}

	@Override
	public ResponseResult<Object> modifyList(Integer tenantId, Integer userId, MessageInstanceVo channelDefinedVo) {
		try {
			return ResponseResult.ok(messageInstanceService.modifyList(CommonParams.build(tenantId, userId), channelDefinedVo));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, MODIFYLIST), e);
		}
	}
	@Override
	public ResponseResult<Object> delete(Integer tenantId, Integer userId,  Integer instanceId) {
		try {
			return ResponseResult.ok(messageInstanceService.delete(CommonParams.build(tenantId, userId), instanceId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, DELETE), e);
		}
	}
	 /*
	  *功能描述 批量删除
	  * @author mjy
	  * @date 2021/8/5 16:48
	  */
	@Override
	public ResponseResult<Object> deleteList(Integer tenantId, Integer userId, MessageInstanceFilters filters) {
		try {
			return ResponseResult.ok(messageInstanceService.deleteList(CommonParams.build(tenantId, userId), filters));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(MESSAGE_INSTANCE_CONTROLLER_IMPL, DELETELIST), e);
		}
	}

}
