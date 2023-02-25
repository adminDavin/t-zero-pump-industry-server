package com.t.zero.b.i.pump.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.t.zero.b.i.pump.service.FileStorageService;
import com.t.zero.basic.common.base.contants.RequestConstants.Header;
import com.t.zero.basic.common.base.controller.TZeroBasicController;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.response.ResponseResult;
import com.t.zero.basic.component.response.ResponseExceptionHandler;



@RestController
@RequestMapping("/template/fileStorage/")
public class FileStorageController extends TZeroBasicController {
    
    private final FileStorageService fileStorageService;
    
    public FileStorageController(ResponseExceptionHandler responseExceptionHandler, FileStorageService fileStorageService) {
        super(responseExceptionHandler);
        this.fileStorageService = new FileStorageService();
    }

    @PostMapping(value = "/upload")
    public ResponseResult<Object> upload(@RequestHeader(value = Header.TENANT_ID) Integer tenantId,
            @RequestHeader(value = Header.USER_ID) Integer userId,
            @RequestParam(value = "storageType") String storageType,
            @RequestParam(value = "file", required = false) MultipartFile file) {
        try {
            return ResponseResult.ok(fileStorageService.upload(CommonParams.build(tenantId, userId), storageType, file));
        } catch (Exception e) {
            return responseExceptionHandler.handle(String.format("ResInfoDefController", "upload"), e);
        }

    }
    
    @GetMapping(value = "/download")
    public void download(HttpServletResponse response,
            @RequestParam(value = "storageType", required = false) String storageType,
            @RequestParam(value = "file", required = false) String file) throws Exception {
            fileStorageService.download(response, storageType, file);
    }

    
}
