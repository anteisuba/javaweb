package com.itheima.pojo;


import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor  //无参构造
@AllArgsConstructor  //全参构造
@Data
public class User {
    private Integer id;
    private String name;
    private Short age;
    private Short gender;
    private String phone;
//    public User(Integer id, String name, Short gender, Short age, String phone) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.phone = phone;
//    }
//
//    public User() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Short getAge() {
//        return age;
//    }
//
//    public void setAge(Short age) {
//        this.age = age;
//    }
//
//    public Short getGender() {
//        return gender;
//    }
//
//    public void setGender(Short gender) {
//        this.gender = gender;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}




