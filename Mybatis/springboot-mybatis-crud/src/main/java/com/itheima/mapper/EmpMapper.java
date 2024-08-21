package com.itheima.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpMapper {
    //根据id删除数据
    @Delete("delete from mybatis.emp where id = #{id}")
    public void delete(Integer id);
}
