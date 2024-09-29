package com.itheima.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    //HttpServletRequest request 前端发送的网络请求，可以获取上下文对象
    public String up(String nickname, MultipartFile photo, HttpServletRequest request)throws IOException {
        System.out.println(nickname);
        //获取图片的原始名称
        System.out.println(photo.getOriginalFilename());
        //获取文件类型
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));

        //得到web服务器运行的目录
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";

    }

    //方法，判断文件是否存在
    public void saveFile(MultipartFile photo,String path) throws IOException {
        //判断存储的目录是否存在，如果不存在则创建
        File dir = new File(path);
        if(!dir.exists()){
            //创建目录
            dir.mkdirs();
        }
        //存储的文件 目录+名称
        File file = new File(path + photo.getOriginalFilename());
        //自动把网络上传输过来的文件存储到目录中
        photo.transferTo(file);
    }
}
