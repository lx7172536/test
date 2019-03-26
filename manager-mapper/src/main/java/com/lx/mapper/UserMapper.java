package com.lx.mapper;

import com.lx.pojo.Users;

import java.util.List;

public interface UserMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
