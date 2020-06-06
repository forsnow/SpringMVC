package com.xuesong.controller;

import com.xuesong.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:控制器类
 * @author: Snow
 * @create: 2020-06-05 11:10
 **/
@Controller("helloController")
public class HelloController {
    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("Test RequestMapping");
        return "RequestMapping";
    }


}
