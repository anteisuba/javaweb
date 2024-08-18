-- 查询所有数据库
show databases;
-- 创建一个数据库
create database db02;

-- DDL：表结构
-- 创建：基本语法

create table tb_user(
    id int comment 'ID,唯一标识',
    username varchar(20) comment '用户名',
    name varchar(10) comment '姓名',
    age int comment '年龄',
    gender char(1) comment '性别'
) comment '用户表';

-- 创建：约束
create table tb_user02 (
                        id int primary key comment 'ID,唯一标识',
                        username  varchar(20) not null unique comment '用户名',
                        name varchar(10) not null comment '姓名',
                        age int comment '年龄',
                        gender char(1) default '男' comment '性别'
) comment '用户表';

-- 查看数据库下的表
show tables;

-- 查看指定表结构
desc tb_emp;

-- 数据库的建表语句
show create table tb_emp;

-- DDL:修改表结构
-- 为表tb_emp 添加字段 qq varchar(11)
alter table tb_emp add qq varchar(11) comment 'QQ';

-- 修改字段类型
alter table tb_emp modify qq varchar(13) comment 'QQ';

-- 修改字段名qq为qq_num varchar(13)
alter table tb_emp change qq qq_num varchar(13) comment 'QQ';

-- 删除tb_emp的qq_num
alter table tb_emp drop column qq_num;

-- 修改表名
rename table tb_emp to emp;

rename table emp to tb_emp;

-- DML:数据操作语言
-- 插入数据 - insert
-- 为username，name，gender 字段插入值
insert into emp(username,name,gender,create_time,update_time) values('wuji','zhangwuji',1,now(),now());



-- 为所有字段插入值
insert into tb_emp(id, username, password, name, gender, image, job, entrydate, create_time, update_time)
    values (null,'yangjian','123','yj',1,'1.jpg',3,'2010-01-01',now(),now());

insert into tb_emp values(null,'hoshi','1234','hoshino',2,'2,jpg',4,'2012-02-02',now(),now());
-- 为username，name，gender字段插入数据
insert into tb_emp(username,name,gender,create_time,update_time)
    values ("yj1","yangjian1",1,now(),now()),("yj2","yangjian2",1,now(),now());

-- 更新数据

update tb_emp set name='张三',update_time=now() where id=1 ;

update tb_emp set entrydate='2010-01-01', update_time=now();

-- 删除数据
-- 删除表中ID为1的员工
delete from tb_emp where id = 1;
-- 删除表中的所有员工
delete from tb_emp;









