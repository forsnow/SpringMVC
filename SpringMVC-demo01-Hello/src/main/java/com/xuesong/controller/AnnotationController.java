package com.xuesong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-07 13:27
 **/
@Controller("annotationController")
@RequestMapping("/anno")
public class AnnotationController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("It works!!!");
        System.out.println(username);
        return "success";
    }

    /**
     * @Description: 获取请求体内容
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
    **/
    @RequestMapping("/testRequestBody")
    public String testRequestBoby(@RequestBody String body){
        System.out.println("整个请求体"+body);
        return "success";
    }


    /**
     * @Description:
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
     **/
    @RequestMapping("/testPathVariable/{uid}")
    public String testPathVariable(@PathVariable(name = "uid") String id){
        System.out.println(id);
        return "success";
    }
}
