package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import com.itheima.service.impl.EmpServiceA;
import com.itheima.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

//@RestController
//public class Empcontroller {
//    @RequestMapping("/listEmp")
//    public Result list() {
//        //加载并解析xml文件
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(file);
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        //对数据进行转换处理 gender,job
//        empList.stream().forEach(emp -> {
//           //处理gender 1:男 2:女
//            String gender = emp.getGender();
//            if ("1".equals(gender)) {
//                emp.setGender("男");
//            } else if ("2".equals(gender)) {
//                emp.setGender("女");
//            }
//
//            //处理job 1:讲师 2:班主任 3:就业指导
//            String job = emp.getJob();
//            if ("1".equals(job)) {
//                emp.setJob("讲师");
//            } else if ("2".equals(job)) {
//                emp.setJob("班主任");
//            } else if ("3".equals(job)) {
//                emp.setJob("就业指导");
//            }
//        });
//
//
//        //响应数据
//        return Result.success(empList);
//
//    }
//
//}

//@Controller
@RestController
public class Empcontroller {


    @Autowired //运行时，IOC容器会提供该类型的bean对象，并赋值给改变了-依赖注入
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        //调用service，获取数据
        List<Emp> empList = empService.listEmp();
        //响应数据
        return Result.success(empList);

    }

}
