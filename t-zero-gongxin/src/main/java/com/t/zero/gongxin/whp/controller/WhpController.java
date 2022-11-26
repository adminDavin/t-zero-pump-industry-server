package com.t.zero.gongxin.whp.controller;

import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.LIST;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.ContentRequest;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.gongxin.whp.service.WhpService;

@RestController
@RequestMapping("/whp")
public class WhpController extends TZeroBasicController {
	public WhpController(ResponseExceptionHandler responseExceptionHandler, WhpService whpService) {
		super(responseExceptionHandler);
		this.whpService = whpService;
	}

	private final WhpService whpService;
	
	@PostMapping(value = "/doAction", produces = RequestConstants.CONTENT_TYPE_JSON)
    public ResponseResult<Object> doAction(
        @RequestBody ContentRequest content) {
        try {
            return ResponseResult.ok(whpService.doAction(content.getContent()));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
        }
    }

}
