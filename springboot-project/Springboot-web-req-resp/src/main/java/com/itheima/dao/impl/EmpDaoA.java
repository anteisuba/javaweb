package com.itheima.dao.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.utils.XmlParserUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //将当前类交给IOC容器管理，成为IOC容器中的bean
public class EmpDaoA implements EmpDao {
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        //加载并解析xml文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
