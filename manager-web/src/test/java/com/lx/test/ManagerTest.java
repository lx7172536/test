package com.lx.test;

import com.lx.mapper.UserMapper;
import com.lx.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUser_age(20);
        users.setUser_name("张飞");
        this.userMapper.insertUser(users);
    }

}
