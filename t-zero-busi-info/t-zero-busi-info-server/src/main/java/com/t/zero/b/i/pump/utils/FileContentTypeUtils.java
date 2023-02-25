package com.t.zero.b.i.pump.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.lang3.StringUtils;

import com.t.zero.basic.common.base.idgenerator.UUID;


public class FileContentTypeUtils {
    /**
     * 根据路径上的文件名获取 contentType
     * 
     * @param type
     * @return
     */
    public static String getFileContentType(String type) {
        String contentType = "";
        if ("3gpp".equalsIgnoreCase(type)) {
            contentType = "audio/3gpp, video/3gpp";
        } else if ("ac3".equalsIgnoreCase(type)) {
            contentType = "audio/ac3";
        } else if ("asf".equalsIgnoreCase(type)) {
            contentType = "allpication/vnd.ms-asf";
        } else if ("au".equalsIgnoreCase(type)) {
            contentType = "audio/basic";
        } else if ("css".equalsIgnoreCase(type)) {
            contentType = "text/css";
        } else if ("csv".equalsIgnoreCase(type)) {
            contentType = "text/csv";
        } else if ("doc".equalsIgnoreCase(type)) {
            contentType = "application/msword";
        } else if ("dot".equalsIgnoreCase(type)) {
            contentType = "application/msword";
        } else if ("dtd".equalsIgnoreCase(type)) {
            contentType = "application/xml-dtd";
        } else if ("dwg".equalsIgnoreCase(type)) {
            contentType = "image/vnd.dwg";
        } else if ("dxf".equalsIgnoreCase(type)) {
            contentType = "image/vnd.dxf";
        } else if ("gif".equalsIgnoreCase(type)) {
            contentType = "image/gif";
        } else if ("htm".equalsIgnoreCase(type)) {
            contentType = "text/html";
        } else if ("html".equalsIgnoreCase(type)) {
            contentType = "text/html";
        } else if ("jp2".equalsIgnoreCase(type)) {
            contentType = "image/jp2";
        } else if ("jpe".equalsIgnoreCase(type)) {
            contentType = "image/jpeg";
        } else if ("jpeg".equalsIgnoreCase(type)) {
            contentType = "image/jpeg";
        } else if ("jpg".equalsIgnoreCase(type)) {
            contentType = "image/jpeg";
        } else if ("js".equalsIgnoreCase(type)) {
            contentType = "text/javascript, application/javascript";
        } else if ("json".equalsIgnoreCase(type)) {
            contentType = "application/json";
        } else if ("mp2".equalsIgnoreCase(type)) {
            contentType = "audio/mpeg, video/mpeg";
        } else if ("mp3".equalsIgnoreCase(type)) {
            contentType = "audio/mpeg";
        } else if ("mp4".equalsIgnoreCase(type)) {
            contentType = "video/mp4";
        } else if ("mpeg".equalsIgnoreCase(type)) {
            contentType = "video/mpeg";
        } else if ("mpg".equalsIgnoreCase(type)) {
            contentType = "video/mpeg";
        } else if ("mpp".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-project";
        } else if ("ogg".equalsIgnoreCase(type)) {
            contentType = "application/ogg, audio/ogg";
        } else if ("pdf".equalsIgnoreCase(type)) {
            contentType = "application/pdf";
        } else if ("png".equalsIgnoreCase(type)) {
            contentType = "image/png";
        } else if ("bmp".equalsIgnoreCase(type)) {
            contentType = "image/bmp";
        } else if ("pot".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-powerpoint";
        } else if ("pps".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-powerpoint";
        } else if ("ppt".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-powerpoint";
        } else if ("rtf".equalsIgnoreCase(type)) {
            contentType = "application/rtf, text/rtf";
        } else if ("svf".equalsIgnoreCase(type)) {
            contentType = "image/vnd.svf";
        } else if ("tif".equalsIgnoreCase(type)) {
            contentType = "image/tiff";
        } else if ("tiff".equalsIgnoreCase(type)) {
            contentType = "image/tiff";
        } else if ("txt".equalsIgnoreCase(type)) {
            contentType = "text/plain";
        } else if ("wdb".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-works";
        } else if ("wps".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-works";
        } else if ("xhtml".equalsIgnoreCase(type)) {
            contentType = "application/xhtml+xml";
        } else if ("xlc".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel";
        } else if ("xlm".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel";
        } else if ("xls".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel";
        } else if ("xlt".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel";
        } else if ("xlw".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel";
        } else if ("xml".equalsIgnoreCase(type)) {
            contentType = "text/xml, application/xml";
        } else if ("zip".equalsIgnoreCase(type)) {
            contentType = "aplication/zip";
        } else if ("xlsx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        } else if ("xltx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.template";
        } else if ("potx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.presentationml.template";
        } else if ("ppsx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.presentationml.slideshow";
        } else if ("pptx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
        } else if ("sldx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.presentationml.slide";
        } else if ("docx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
        } else if ("dotx".equalsIgnoreCase(type)) {
            contentType = "application/vnd.openxmlformats-officedocument.wordprocessingml.template";
        } else if ("xlsm".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel.addin.macroEnabled.12";
        } else if ("xlsb".equalsIgnoreCase(type)) {
            contentType = "application/vnd.ms-excel.sheet.binary.macroEnabled.12";
        } else if ("ofd".equalsIgnoreCase(type)) {
            contentType = "application/ofd";
        }

        return contentType;
    }
    /**
     * 读取文件
     * @param file
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static byte[] getFileBuffer(String file) throws FileNotFoundException, IOException {
        var fis = new BufferedInputStream(new FileInputStream(file));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        return buffer;
    }
    /**
     * 获取文件类型
     * @param ext
     * @return
     */
    public static String getContentType(String ext) {
        String contentType = getFileContentType(ext);
        if (StringUtils.isEmpty(contentType)) {
            contentType = "application/octet-stream;charset=utf-8";
        }
        return contentType;
    }
    
    public static String getRandom() {
        return "/" + UUID.randomUUID().toString();
    }

    public static String getFilename(Path fileStoragePath) {
        return String.format("attachment; filename=%s", fileStoragePath.getFileName());
    }

}
