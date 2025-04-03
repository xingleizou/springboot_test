package com.example.demo.service;

import com.example.demo.pojo.User;

public interface UserService {
    //根据用户名查询用户1
    User findByUserName(String username);
    //注册
    void register(String username, String password);
}
