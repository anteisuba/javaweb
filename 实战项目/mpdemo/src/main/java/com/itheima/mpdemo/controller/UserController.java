package com.itheima.mpdemo.controller;

import com.itheima.mpdemo.entity.User;
import com.itheima.mpdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    //注入usermapper
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List query() {
        List<User> list = userMapper.finduser();
        System.out.println(list);
        return list;
    }

    @PostMapping("/user")
    public String save(User user) {
        int i = userMapper.insert(user);
        if (i > 0) {
            return "success";
        } else {
            return "fail";
        }
    }

}
