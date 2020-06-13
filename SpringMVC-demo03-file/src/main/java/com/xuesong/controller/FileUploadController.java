package com.xuesong.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-08 13:53
 **/
@Controller("fileUploadController")
@RequestMapping("/file")
public class FileUploadController {

    /**
     * @Description: 传统文件上传功能
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
     **/
    @RequestMapping(value = "/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("fileUpload1 works：traditional fileuploader");
        //使用file-uploads组件完成上传
        //上传的位置
        String uploadPath = request.getSession().getServletContext().getRealPath("/uploads");
        //判断路径是否存在
        File file = new File(uploadPath);
        if (!file.exists()) {
            //创建该文件夹
            file.mkdirs();
        }

        //解析request对象，拿到文件项,创建磁盘文件项工厂
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);

        //解析request对象
        List<FileItem> fileItems = servletFileUpload.parseRequest(request);

        //遍历
        for (FileItem fileItem : fileItems) {
            //判断上传的文件是普通字段，还是上传的文件
            if (fileItem.isFormField()) {

            } else {
                //获取上传文件名称
                String fileName = fileItem.getName();
                //把文件名设置为唯一值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                fileName = uuid + "_" + fileName;
                //上传文件项
                fileItem.write(new File(uploadPath, fileName));
                //删除临时文件
                fileItem.delete();

            }
        }

        return "success";
    }


    /**
     * @Description: SpringMVC文件上传功能, SpringMVC提供了MultipartFile对象
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
     **/
    @RequestMapping(value = "/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("fileUpload2 works：SpringMVC file upload");
        //获取上传目录
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        //创建File对象
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        //获取上传文件的名称
        String originalFilename = upload.getOriginalFilename();
        //把文件名唯一化
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        originalFilename = uuid + "-" + originalFilename;
        //上传文件
        upload.transferTo(new File(file, originalFilename));

        return "success";
    }

    /**
     * @Description: SpringMVC文件上传功能, SpringMVC提供了MultipartFile对象
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
     **/
    @RequestMapping(value = "/fileUpload3")
    public String fileUpload3(MultipartFile upload) throws Exception {
        System.out.println("fileUpload3 works：SpringMVC fileupload across server ");
        //获取文件名称
        String filename = upload.getOriginalFilename();
        //设置唯一文件名称
        String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        filename = uuid + "-" + filename;
        //完成文件上传，跨服务器上传

        //定义图片服务器的请求路径
        String path = "http://localhost:8081/fileserver/uploads";

        //创建客户端对象
        Client client = Client.create();
        WebResource webResource = client.resource(path + "/" + filename);
        //上传文件
        webResource.put(upload.getBytes());

        return "success";
    }


}
