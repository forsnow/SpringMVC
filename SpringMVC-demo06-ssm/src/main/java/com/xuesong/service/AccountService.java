package com.xuesong.service;

import com.xuesong.domain.Account;

import java.util.List;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-13 17:17
 **/
public interface AccountService {
    void saveAccount(Account account);
    List<Account> findAll();
}
