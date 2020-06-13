package com.xuesong.controller;

import com.xuesong.Exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-12 16:12
 **/
@Controller("testExceptionController")
@RequestMapping("/exception")
public class TestExceptionController {

    @RequestMapping("/test1")
    public String test1() throws Exception{
        System.out.println("Test Exception Running~~~");

        try {
            int i = 10/0;
        } catch (Exception e) {
            //控制台打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有的用户出现了错误");
        }

        return "error";
    }
}
