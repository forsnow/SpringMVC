package com.xuesong.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-06 15:13
 **/
public class Account implements Serializable {
    private String username;
    private String password;
    private Float money;

    private List<User> userList;
    private Map<String,User> userMap;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
