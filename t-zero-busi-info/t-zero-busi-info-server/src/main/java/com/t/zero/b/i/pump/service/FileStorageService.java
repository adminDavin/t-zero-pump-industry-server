package com.t.zero.b.i.pump.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import com.t.zero.b.i.pump.utils.FileContentTypeUtils;
import com.t.zero.basic.common.base.request.CommonParams;


@Service
public class FileStorageService {

    public static String fileStorage = "fileStorage";
    public static String filePath = "/file-storage/template/";
    public static String rootURL = "classpath:";

    public Object upload(CommonParams params, String storageType, MultipartFile file)
            throws IllegalStateException, IOException {
        var fileStoragePath = Path.of(Path.of(ResourceUtils.getURL(rootURL).getPath()).getParent() + filePath);
        if (fileStorage.equals(storageType) && !Files.exists(fileStoragePath)) {
            new File(fileStoragePath.toString()).mkdir();
        }
        var f = file.getOriginalFilename();
        String fileExtension = f.substring(f.lastIndexOf("."));
        var fileName = new File(fileStoragePath + FileContentTypeUtils.getRandom() + fileExtension);
        file.transferTo(fileName);
        return fileName;
    }

    public void download(HttpServletResponse response, String storageType, String file) throws Exception {
        var fileStoragePath = Path.of(file);
        System.out.println(fileStoragePath);
        if (fileStorage.equals(storageType)) {
            if (!Files.exists(fileStoragePath)) {
                throw new Exception("文件不存在");
            }
        }
        
        response.reset();
        response.setHeader("Content-disposition", FileContentTypeUtils.getFilename(fileStoragePath));
        var toClient = new BufferedOutputStream(response.getOutputStream());
        response.setContentType(FileContentTypeUtils.getContentType(file.substring(file.lastIndexOf("."))));
        toClient.write(FileContentTypeUtils.getFileBuffer(file));
        toClient.flush();
        toClient.close();
    }

}
