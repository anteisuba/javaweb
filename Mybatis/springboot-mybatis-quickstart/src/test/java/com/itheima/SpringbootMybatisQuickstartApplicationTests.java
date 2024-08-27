package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest  //springboot整合单元测试的注解
class SpringbootMybatisQuickstartApplicationTests {

    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void testListUser() {
//        List<User> userList = userMapper.list();
//        userList.stream().forEach(user -> {
//            System.out.println(user);
//        });
//    }

    @Test
    public void testDelete() {
        int delete = userMapper.delete(16);
        System.out.println(delete);
    }

    @Test
    public void testInsert() {
        //构造员工对象
        User user = new User();
        user.setName("Tom");


        userMapper.insert(user);
    }

//    @Test
//    public void testGetId() {
//        User user = userMapper.getById(10);
//        System.out.println(user);
//    }

    @Test
    public void testList() {
//        List<User> userList = userMapper.list("张",(short) 1, LocalDate.of(2010,1,1),LocalDate.of(2020,1,1));
        List<User> userList = userMapper.list(null, (short) 1, null, null);
        System.out.println(userList);
    }

    @Test
    public void testDeleteByIds() {
        List<Integer> ids =  Arrays.asList(1,2,3);
        userMapper.deleteById(ids);
    }

}
