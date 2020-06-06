package com.xuesong.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:把字符串转化为日期
 * @author: Snow
 * @create: 2020-06-06 16:55
 **/
public class StringToDateConverter implements Converter<String, Date> {

    /**
     * @Description: TODO
     * @Param: [source] 这个值指的是传进来的字符串
     * @Return: java.util.Date
     * @Author: Snow
    **/
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("传入字符串为空");
        }

        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出错");
        }

    }
}
