package com.xuesong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-12 16:12
 **/
@Controller("testExceptionInterceptor")
@RequestMapping("/Interceptor")
public class TestExceptionInterceptor {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("Test Interceptor Running~~~");

        return "success";
    }
}
