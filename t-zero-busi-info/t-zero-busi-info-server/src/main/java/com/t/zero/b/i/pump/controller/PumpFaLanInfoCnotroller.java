package com.t.zero.b.i.pump.controller;

import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.LIST;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t.zero.b.i.pump.service.PumpFaLanInfoService;
import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.contants.RequestConstants.Header;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.request.ContentRequest;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;

@RestController
@RequestMapping("/pump_falan")
public class PumpFaLanInfoCnotroller extends TZeroBasicController {
	private final PumpFaLanInfoService pumpAttributesService;

	public PumpFaLanInfoCnotroller(ResponseExceptionHandler responseExceptionHandler, PumpFaLanInfoService pumpAttributesService) {
		super(responseExceptionHandler);
		this.pumpAttributesService = pumpAttributesService;
	}

	@PostMapping(value = "/list", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> list(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(pumpAttributesService.list(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}
	
	@PostMapping(value = "/createOrModify", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> modify(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(pumpAttributesService.createOrModify(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}

	@PostMapping(value = "/delete", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> delete(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult.ok(pumpAttributesService.delete(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}
}
