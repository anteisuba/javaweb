package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
//public class ResponseController {
//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("Hello world");
//        return "Hello world";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address addr = new Address();
//        addr.setProvince("guangdong");
//        addr.setCity("shenzhen");
//        return addr;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> list = new ArrayList<>();
//        Address addr = new Address();
//        addr.setProvince("guangdong");
//        addr.setCity("shenzhen");
//
//        Address addr2 = new Address();
//        addr2.setProvince("shanxi");
//        addr2.setCity("xian");
//
//        list.add(addr);
//        list.add(addr2);
//
//        return list;
//
//    }
//}
@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello world");
        //return new Result(1,"success","Hello world");
        return Result.success("Hello world ~");
    }

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("guangdong");
        addr.setCity("shenzhen");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();
        Address addr = new Address();
        addr.setProvince("guangdong");
        addr.setCity("shenzhen");

        Address addr2 = new Address();
        addr2.setProvince("shanxi");
        addr2.setCity("xian");

        list.add(addr);
        list.add(addr2);

        return Result.success(list);

    }
}
