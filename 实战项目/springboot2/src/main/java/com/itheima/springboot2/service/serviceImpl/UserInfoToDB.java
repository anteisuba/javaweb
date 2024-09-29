package com.itheima.springboot2.service.serviceImpl;

import com.itheima.springboot2.entity.User;
import com.itheima.springboot2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoToDB {
    @Autowired
    UserMapper userMapper;

    public String inputFilePath= "/Users/fulina/IT/javaweb/实战项目/springboot2/tmp/work/input.txt";

    public void readFileAndWriteToDB() {
        List<User> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath))){
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",",-1);
                User user = new User();
                user.setId(Integer.parseInt(fields[0]));
                user.setName(fields[1]);
                user.setAge(Integer.parseInt(fields[2]));
                user.setGender(fields[3]);
                user.setPhone(fields[4]);
                data.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (User user: data) {
            userMapper.readFileAndWrite(user);
        }

    }
}
