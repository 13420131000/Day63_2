package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class UploadController {
    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) {
        System.out.println("inner upload");
        System.out.println(dropzFile);
        Map<String, Object> result = new HashMap<String, Object>();

        // 获取上传的原始文件名
        String fileName = dropzFile.getOriginalFilename();
        // 设置文件上传路径
        String filePath = request.getSession().getServletContext().getContextPath();
        System.out.println(filePath);
        // 获取文件后缀
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());

        // 判断并创建上传用的文件夹
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
        // 重新设置文件名为 UUID，以确保唯一
        file = new File(filePath, UUID.randomUUID() + fileSuffix);
        System.out.println(file.getAbsolutePath());
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            // 写入文件
            dropzFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回 JSON 数据，这里只带入了文件名
        result.put("fileName", file.getName());
        return result;
    }
}
