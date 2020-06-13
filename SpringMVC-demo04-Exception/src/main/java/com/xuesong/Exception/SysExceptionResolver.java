package com.xuesong.Exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-12 16:10
 **/
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //获取到异常对象
        SysException sysException = null;
        if (e instanceof  SysException){
            sysException = (SysException)e;
        }else{
            sysException = new SysException("系统正在维护...");
        }

        //创建ModelAndView这个对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
