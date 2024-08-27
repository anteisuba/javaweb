package com.itheima.service;


import com.itheima.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

//    查询全部部门数据

    List<Dept> list();

    //删除部门
    void delete(Integer id);

    //新增部门
    void add(Dept dept);
}
