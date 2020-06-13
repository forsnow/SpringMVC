package com.xuesong.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:自定义拦截器
 * @author: Snow
 * @create: 2020-06-12 17:29
 **/
public class MyInterceptor1 implements HandlerInterceptor {

    /**
     * @Description: 预处理
     * @Param: [request, response, handler]
     * @Return: boolean
     * @Author: Snow
    **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor1 worked");
        
        return true;
    }
}
