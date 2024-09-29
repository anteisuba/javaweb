package com.itheima.controller;

import com.itheima.entitiy.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    //动态绑定id，通过PathVariable获取id
    public String
    getUserById(@PathVariable int id) {
        return "根据id获取用户";
    }
    @PostMapping("/user")
    public String save(User user) {
        return "添加用户";
    }
    @PutMapping("/user")
    public String update(User user) {
        return "更新用户";
    }
    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id) {
        return "根据id删除用户";
    }
}
