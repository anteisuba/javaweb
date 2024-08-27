package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface UserMapper {


    //查询全部用户信息
//    @Select("select * from user")
//    public List<User> list();

    @Delete("delete from emp where id=#{id}")
    public int delete(Integer id);

    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
    "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(User user);

    @Update("update emp set username = '#{username',name = '#{name}',gender='#{gender}',image='#{image}',job='#{job}',entrydate='#{entrydate}',dept_id='#{depId}',update_time='updateTime' where id=1")
    public void update(User user);

    //开启mybatis的驼峰自动命名开关


//    @Select("select * from user where id=#{id}")
//    public User getById(int i);


//    @Select("select * from user where name like '%${name}%' and gender = #{gender}")
    public List<User> list(String name,Short gender,LocalDate begin,LocalDate end);


    public void update2(User user);

    public void deleteById(List<Integer> ids);

}
