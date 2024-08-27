package com.itheima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor  //无参构造
@AllArgsConstructor  //全参构造
@Data
public class Emp {
    private Integer id;
    private String name;
    private Integer age;

}
