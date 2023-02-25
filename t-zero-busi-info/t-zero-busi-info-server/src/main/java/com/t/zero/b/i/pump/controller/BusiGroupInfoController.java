package com.t.zero.b.i.pump.controller;

import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.LIST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.t.zero.b.i.pump.service.BusiGroupInfoService;
import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.contants.RequestConstants.Header;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.request.ContentRequest;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;

@RestController
@RequestMapping("/busi_group_info")
public class BusiGroupInfoController extends TZeroBasicController {
	private final BusiGroupInfoService busiGroupInfoService;

	public BusiGroupInfoController(ResponseExceptionHandler responseExceptionHandler, BusiGroupInfoService busiGroupInfoService) {
		super(responseExceptionHandler);
		this.busiGroupInfoService = busiGroupInfoService;
	}
	
	
	@GetMapping(value = "/get", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> get(@RequestParam(value = "majorKey", required = true) String majorKey, @RequestParam(value = "pumpSource", required = true) String pumpSource) {
		try {
			return ResponseResult.ok(busiGroupInfoService.get(majorKey, pumpSource));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}
	
	@PostMapping(value = "/multi_get", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> multiGet(@RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(busiGroupInfoService.multiGet(content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}
	
	
	@PostMapping(value = "/createOrModify", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> modify(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(busiGroupInfoService.createOrModify(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}


	@PostMapping(value = "/delete", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> delete(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(busiGroupInfoService.delete(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}
}
