package com.itheima.springboot2.controller;


import com.itheima.springboot2.entity.User;
import com.itheima.springboot2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, @RequestParam String phone, Model model) {
        User user = userMapper.selectUserInfo(name, phone);
        if(user != null) {
            model.addAttribute("user",user);
            return "welcome";
        } else {
            model.addAttribute("error","ログインID又はパスワードが間違いました");
            return "login";
        }
    }

}
