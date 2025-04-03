package com.example.demo.controller;

import com.example.demo.pojo.Result;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private  UserService userService;
    @PostMapping("/register")
    public Result register(@RequestParam String username, @RequestParam String password){
        //查询用户
        User u =userService.findByUserName(username);
        if(u==null){
            userService.register(username,password);
            return Result.success();
        }
        else{
            return Result.error("用户名已被占用");
        }

    }
}
