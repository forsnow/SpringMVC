package com.xuesong.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:自定义拦截器
 * @author: Snow
 * @create: 2020-06-12 17:29
 **/
public class MyInterceptor1 implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        
    }

    /**
     * @Description: 后处理的方法
     * @Param: [request, response, handler, modelAndView]
     * @Return: void
     * @Author: Snow
    **/
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor1 worked postHandle");
        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);

    }

    /**
     * @Description: 预处理
     * @Param: [request, response, handler]
     * @Return: boolean
     * @Author: Snow
    **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor1 worked preHandle");
        //request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        return true;
    }
}
