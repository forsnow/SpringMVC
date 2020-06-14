package com.xuesong.test;

import com.xuesong.dao.AccountDao;
import com.xuesong.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description:
 * @author: Snow
 * @create: 2020-06-14 17:05
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class MybatisTest {
    private InputStream inputStream;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private AccountDao mapperAccount;


    @Before
    public void init() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatis-config.xml.bak");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession(true);
        //通过SqlSession获取一个AccountDao的代理对象
        mapperAccount = sqlSession.getMapper(AccountDao.class);
    }

    @After
    public void destroy() throws IOException {
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void testsaveAccount(){
        Account account = new Account();
        account.setMoney(1000d);
        account.setName("Melody");
        mapperAccount.saveAccount(account);
    }

    @Test
    public void testfindAll(){
        List<Account> all = mapperAccount.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

}
