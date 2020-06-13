package com.xuesong.Exception;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-12 16:02
 **/
public class SysException extends Exception {
    //异常存储消息
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
