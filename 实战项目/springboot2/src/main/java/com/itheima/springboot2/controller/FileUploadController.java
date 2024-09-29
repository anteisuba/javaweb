package com.itheima.springboot2.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        //读取图片原始名称
        System.out.println(photo.getOriginalFilename());
        //读取文件类型
        System.out.println(photo.getContentType());

        //得到web服务器运行的目录
        String path = request.getServletContext().getRealPath("/upload");
        System.out.println(path);
        saveFile(photo,path);
        return "success";


    }

    public void saveFile(MultipartFile photo,String path) throws IOException {
        //判断目录是否存在
        File file = new File(path);
        if (!file.exists()) {
            //如果不存在则创建目录
            file.mkdir();
        }
        //存储文件
        File file1 = new File(path + photo.getOriginalFilename());
        photo.transferTo(file1);
    }

}
