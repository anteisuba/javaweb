package com.itheima.springboot2.mapper;

import com.itheima.springboot2.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface UserMapper {
    void readFileAndWrite(User user);
    User selectUserInfo(String name,String phone);

    void insertUser(User user);
}
