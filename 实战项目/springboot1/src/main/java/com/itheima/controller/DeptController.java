package com.itheima.controller;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;


@Slf4j
@RestController
@RequestMapping("/depts")  //提取路径
public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;


    //@RequestMapping(value = "/depts",method = RequestMethod.GET)  //指定请求方式为GET
    @GetMapping()  //限定了请求方式
    public Result list() {

        log.info("查询全部部门数据");

        //调用service查询的部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    //删除部门数据
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除部门" ,id);
        deptService.delete(id);
        return Result.success();
    }

    //新增部门
    @PostMapping()
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门" , dept);
        //调用service新增部门
        deptService.add(dept);
        return Result.success();
    }


}
