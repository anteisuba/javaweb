package com.itheima.mpdemo.mapper;

import com.itheima.mpdemo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("select * from user")
    public List<User> finduser();

    @Insert("insert into user values (#{id},#{name},#{age},#{phone}) ")
    public int insert(User user);
}
