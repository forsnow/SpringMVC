package com.xuesong.controller;

import com.xuesong.domain.Account;
import com.xuesong.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-06 15:00
 **/
@Controller("paramController")
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("It works");
        System.out.println("I got your name !!"+username);
        System.out.println("I got your password !!"+password);
        return "param";
    }

    /**
     * @Description: 把请求数据封装到一个JavaBean的类中
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
    **/
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "param";
    }

    /**
     * @Description: 测试自定义类型转化器
     * @Param: [user]
     * @Return: java.lang.String
     * @Author: Snow
    **/
    @RequestMapping(path = "/testDateParam")
    public String testDateParam(User user){
        System.out.println(user);
        return "success";
    }

    /**
     * @Description: 测试原生的ServletApi
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
    **/
    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("It works");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }

}
