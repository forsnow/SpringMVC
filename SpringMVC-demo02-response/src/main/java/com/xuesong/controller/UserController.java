package com.xuesong.controller;

import com.xuesong.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-07 16:28
 **/
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString works");
       //模拟从数据库中查询到User
        User user = new User();
        user.setUsername("xuesong");
        user.setPassword("123");
        user.setAge(24);
        //model 存储数据
        model.addAttribute("user",user);
        return "success";
    }


    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid works");
        //转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //重定向
        //response.sendRedirect(request.getContextPath()+"/redirect.jsp");

        //直接进行响应
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("雪松你好xixi");
        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView works");

        //创建一个ModelAndView对象
        ModelAndView mv = new ModelAndView();

        User user = new User();
        user.setUsername("modelandview");
        user.setPassword("0.0");
        user.setAge(24);

        //可以把user对象存入mv中，也会把user对象存入request对象中
        mv.addObject("user",user);

        //跳转到哪个页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * @Description: 使用关键字的方式进行的转发或者重定向
     * @Param: []
     * @Return: java.lang.String
     * @Author: Snow
    **/
    @RequestMapping("/testForwardAndRedirect")
    public String testForwardAndRedirect(){
        System.out.println("testForwardAndRedirect works");

        //请求的转发
        //return "forward:/WEB-INF/pages/success.jsp";

        //重定向
        return "redirect:/redirect.jsp";
    }

    /**
     * @Description: 模拟异步请求响应
     * @Param: []
     * @Return: void
     * @Author: Snow
    **/
    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body){
        System.out.println("testAjax works");
        System.out.println(body);

    }

}
