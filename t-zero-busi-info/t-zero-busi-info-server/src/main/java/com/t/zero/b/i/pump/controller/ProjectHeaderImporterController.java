package com.t.zero.b.i.pump.controller;

import static com.t.zero.basic.common.base.contants.TZeroMethodConstants.LIST;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.t.zero.b.i.pump.service.ProjectHeaderImporterService;
import com.t.zero.basic.common.base.contants.RequestConstants;
import com.t.zero.basic.common.base.contants.RequestConstants.Header;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.request.ContentRequest;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;

@RestController
@RequestMapping("/project_header_importer")
public class ProjectHeaderImporterController extends TZeroBasicController {
	private final ProjectHeaderImporterService projectHeaderImporterService;

	public ProjectHeaderImporterController(ResponseExceptionHandler responseExceptionHandler,
			ProjectHeaderImporterService projectHeaderImporterService) {
		super(responseExceptionHandler);
		this.projectHeaderImporterService = projectHeaderImporterService;
	}

	@PostMapping(value = "/do_import", produces = RequestConstants.CONTENT_TYPE_JSON)
	public ResponseResult<Object> doImportProject(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
			@RequestHeader(value = Header.USER_ID) Integer userId, @RequestBody ContentRequest content) {
		try {
			return ResponseResult
					.ok(projectHeaderImporterService.doImportProject(CommonParams.build(tenantId, userId), content.getContent()));
		} catch (Exception e) {
			return responseExceptionHandler.handle(String.format("ResInfoDefController", LIST), e);
		}
	}

}
