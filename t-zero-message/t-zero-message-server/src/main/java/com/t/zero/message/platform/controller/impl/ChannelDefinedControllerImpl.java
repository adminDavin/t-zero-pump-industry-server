package com.t.zero.message.platform.controller.impl;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.message.platform.controller.ChannelDefinedController;
import com.t.zero.message.platform.service.ChannelDefinedService;
import com.t.zero.message.platform.vo.request.ChannelDefinedVo;
import org.springframework.web.bind.annotation.RestController;


import static com.t.zero.message.platform.constant.TMessageConstant.LISTDEFAULT;
import static com.t.zero.message.platform.constant.TMessageConstant.FORBITCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.FOLLOWCHANNEL;
import static com.t.zero.message.platform.constant.TMessageConstant.ENABLECHANNEL;
import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.*;


@RestController
public class ChannelDefinedControllerImpl extends TZeroBasicController implements ChannelDefinedController {

	public ChannelDefinedControllerImpl(ResponseExceptionHandler responseExceptionHandler, ChannelDefinedService channelDefinedService ) {
		super(responseExceptionHandler);
		this.channelDefinedService = channelDefinedService;
		//this.messageHandleService = messageHandleService;
		//this.mapper = mapper;
	}
	private final String CHANNEL_DEFINED_CONTROLLER_IMPL = "CHANNEL_DEFINED_CONTROLLER_IMPL.%s failed";
	private final ChannelDefinedService channelDefinedService;



	@Override
	public ResponseResult<Object> list(Integer tenantId, Integer userId) {
		try {
			return ResponseResult.ok(channelDefinedService.list(CommonParams.build(tenantId, userId), tenantId, userId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, LIST), e);
		}
	}
	
	@Override
	public ResponseResult<Object> listDefault(Integer tenantId, Integer userId) {
		try {
			return ResponseResult.ok(channelDefinedService.list(CommonParams.build(tenantId, userId), tenantId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, LISTDEFAULT), e);
		}
	}
	
	@Override
	public ResponseResult<Object> forbitChannel(Integer tenantId, Integer userId, Integer channelId) {
		try {
			return ResponseResult.ok(channelDefinedService.forbitChannel(CommonParams.build(tenantId, userId), tenantId, userId, channelId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, FORBITCHANNEL), e);
		}
	}
	
	@Override
	public ResponseResult<Object> enableChannel(Integer tenantId, Integer userId, Integer channelId) {
		try {
			return ResponseResult.ok(channelDefinedService.enableChannel(CommonParams.build(tenantId, userId), tenantId, userId, channelId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, ENABLECHANNEL), e);
		}
	}
	
	@Override
    public ResponseResult<Object> followChannel(Integer tenantId, Integer userId, Integer channelId) {
		try {
			return ResponseResult.ok(channelDefinedService.followChannel(CommonParams.build(tenantId, userId), tenantId, userId, channelId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, FOLLOWCHANNEL), e);
		}
	}


	
	@Override
    public ResponseResult<Object> get(Integer tenantId, Integer userId, Integer channelId) {
		try {
			return ResponseResult.ok(channelDefinedService.get(CommonParams.build(tenantId, userId), channelId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, GET), e);
		}
	}
	
	@Override
	public ResponseResult<Object> save(Integer tenantId, Integer userId,ChannelDefinedVo channelDefinedVo) {
		try {
			return ResponseResult.ok(channelDefinedService.save(CommonParams.build(tenantId, userId), channelDefinedVo));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, SAVE), e);
		}
	}
	
	@Override
	public ResponseResult<Object> modify(Integer tenantId, Integer userId,ChannelDefinedVo channelDefinedVo) {
		try {
			return ResponseResult.ok(channelDefinedService.modify(CommonParams.build(tenantId, userId), channelDefinedVo));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, MODIFY), e);
		}
	}

	@Override
	public ResponseResult<Object> delete(Integer tenantId, Integer userId, Integer channelId) {
		try {
			return ResponseResult.ok(channelDefinedService.delete(CommonParams.build(tenantId, userId), channelId));
		} catch(Exception e) {
			return responseExceptionHandler.handle(String.format(CHANNEL_DEFINED_CONTROLLER_IMPL, DELETE), e);
		}
	}

	//private final MessageHandleService messageHandleService;
	//private final ObjectMapper mapper;
//	@Override
//	public ResponseResult<Object> enableChannel() throws Exception {
//		var content = "{\"templateType\":\"authenticationType\",\"businessType\":\"senmessage\",\"tenantId\":\"3\",\"variables\":{\"smsCode\":\"1234\"}, \"users\": [{\"phone\": \"17731285315\"}]}";
//		var data = mapper.readTree(content);
//		messageHandleService.handle(data);
//		return ResponseResult.failed("777");
//	}
}
