package com.xuesong.controller;

import com.xuesong.domain.Account;
import com.xuesong.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description:账户web层 控制层
 * @author: Snow
 * @create: 2020-06-13 17:24
 **/
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("=============Controller findAll works=============");
        List<Account> accountList = accountService.findAll();
        model.addAttribute("list",accountList);
        return "list";
    }

    @RequestMapping(value = "/saveAccount")
    public String saveAccount(Account account){
        System.out.println("=============Controller saveAccount works=============");
        accountService.saveAccount(account);
        return "success";
    }
}
