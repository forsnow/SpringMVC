package com.xuesong.dao;

import com.xuesong.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-13 17:14
 **/
@Repository
public interface AccountDao {
    //保存账户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);

    //查询所有账户
    @Select("select * from account")
    List<Account> findAll();
}
