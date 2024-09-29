package com.itheima.springboot2;

import com.itheima.springboot2.service.serviceImpl.UserInfoToDB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot2ApplicationTests {

    @Autowired
    UserInfoToDB userInfoToDB;

    @Test
    void contextLoads() {
    }

    @Test
    void readAndWriteDB() {
        userInfoToDB.readFileAndWriteToDB();
        System.out.println("success!");
    }

}
