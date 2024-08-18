-- 员工管理(带约束)
create table tb_emp
(
    id          int unsigned primary key auto_increment comment 'ID',
    username    varchar(20)      not null unique comment '用户名',
    password    varchar(32) default '123456' comment '密码',
    name        varchar(10)      not null comment '姓名',
    gender      tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
    image       varchar(300) comment '图像',
    job         tinyint unsigned comment '职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管',
    entrydate   date comment '入职时间',
    dept_id int unsigned comment '归属部门ID',
    create_time datetime         not null comment '创建时间',
    update_time datetime         not null comment '修改时间'
) comment '员工表';

-- 准备测试数据
INSERT INTO tb_emp (id, username, password, name, gender, image, job, entrydate, create_time, update_time)
VALUES (1, 'jinyong', '123456', '金庸', 1, '1.jpg', 4, '2000-01-01', '2022-10-27 16:35:33', '2022-10-27 16:35:35'),
       (2, 'zhangwuji', '123456', '张无忌', 1, '2.jpg', 2, '2015-01-01', '2022-10-27 16:35:33', '2022-10-27 16:35:37'),
       (3, 'yangxiao', '123456', '杨逍', 1, '3.jpg', 2, '2008-05-01', '2022-10-27 16:35:33', '2022-10-27 16:35:39'),
       (4, 'weiyixiao', '123456', '韦一笑', 1, '4.jpg', 2, '2007-01-01', '2022-10-27 16:35:33', '2022-10-27 16:35:41'),
       (5, 'changyuchun', '123456', '常遇春', 1, '5.jpg', 2, '2012-12-05', '2022-10-27 16:35:33',
        '2022-10-27 16:35:43'),
       (6, 'xiaozhao', '123456', '小昭', 2, '6.jpg', 3, '2013-09-05', '2022-10-27 16:35:33', '2022-10-27 16:35:45'),
       (7, 'jixiaofu', '123456', '纪晓芙', 2, '7.jpg', 1, '2005-08-01', '2022-10-27 16:35:33', '2022-10-27 16:35:47'),
       (8, 'zhouzhiruo', '123456', '周芷若', 2, '8.jpg', 1, '2014-11-09', '2022-10-27 16:35:33', '2022-10-27 16:35:49'),
       (9, 'dingminjun', '123456', '丁敏君', 2, '9.jpg', 1, '2011-03-11', '2022-10-27 16:35:33', '2022-10-27 16:35:51'),
       (10, 'zhaomin', '123456', '赵敏', 2, '10.jpg', 1, '2013-09-05', '2022-10-27 16:35:33', '2022-10-27 16:35:53'),
       (11, 'luzhangke', '123456', '鹿杖客', 1, '11.jpg', 2, '2007-02-01', '2022-10-27 16:35:33',
        '2022-10-27 16:35:55'),
       (12, 'hebiweng', '123456', '鹤笔翁', 1, '12.jpg', 2, '2008-08-18', '2022-10-27 16:35:33', '2022-10-27 16:35:57'),
       (13, 'fangdongbai', '123456', '方东白', 1, '13.jpg', 1, '2012-11-01', '2022-10-27 16:35:33',
        '2022-10-27 16:35:59'),
       (14, 'zhangsanfeng', '123456', '张三丰', 1, '14.jpg', 2, '2002-08-01', '2022-10-27 16:35:33',
        '2022-10-27 16:36:01'),
       (15, 'yulianzhou', '123456', '俞莲舟', 1, '15.jpg', 2, '2011-05-01', '2022-10-27 16:35:33',
        '2022-10-27 16:36:03'),
       (16, 'songyuanqiao', '123456', '宋远桥', 1, '16.jpg', 2, '2010-01-01', '2022-10-27 16:35:33',
        '2022-10-27 16:36:05'),
       (17, 'chenyouliang', '12345678', '陈友谅', 1, '17.jpg', null, '2015-03-21', '2022-10-27 16:35:33',
        '2022-10-27 16:36:07'),
       (18, 'zhang1', '123456', '张一', 1, '2.jpg', 2, '2015-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:09'),
       (19, 'zhang2', '123456', '张二', 1, '2.jpg', 2, '2012-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:11'),
       (20, 'zhang3', '123456', '张三', 1, '2.jpg', 2, '2018-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:13'),
       (21, 'zhang4', '123456', '张四', 1, '2.jpg', 2, '2015-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:15'),
       (22, 'zhang5', '123456', '张五', 1, '2.jpg', 2, '2016-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:17'),
       (23, 'zhang6', '123456', '张六', 1, '2.jpg', 2, '2012-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:19'),
       (24, 'zhang7', '123456', '张七', 1, '2.jpg', 2, '2006-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:21'),
       (25, 'zhang8', '123456', '张八', 1, '2.jpg', 2, '2002-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:23'),
       (26, 'zhang9', '123456', '张九', 1, '2.jpg', 2, '2011-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:25'),
       (27, 'zhang10', '123456', '张十', 1, '2.jpg', 2, '2004-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:27'),
       (28, 'zhang11', '123456', '张十一', 1, '2.jpg', 2, '2007-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:29'),
       (29, 'zhang12', '123456', '张十二', 1, '2.jpg', 2, '2020-01-01', '2022-10-27 16:35:33', '2022-10-27 16:36:31');


-- DQL 基本查询
-- 查询指定字段name,entrydate 并返回
SELECT name,entrydate from tb_emp;

-- 查询返回所有字段
SELECT * from tb_emp;

-- 查询所有员工的name，entrydate，并起别名
SELECT name as '姓 名',entrydate as 入职日期 from tb_emp;

-- 查询已有的员工关联了哪几种职位
SELECT distinct job from tb_emp;

-- ========= DQL:条件查询 ==========
select * from tb_emp where name = '杨逍';

select * from tb_emp where id <= 5;

select * from tb_emp where job is null;

select * from tb_emp where job is not null ;

select * from tb_emp where entrydate between '2001-01-01' and '2010-01-01';

select * from tb_emp where entrydate between '2001-01-01' and '2010-01-01' and gender = 2;

select * from tb_emp where job = 2 or job = 3 or job = 4;

select * from tb_emp where job in (2,3,4);

select * from tb_emp where name like '__';

select * from tb_emp where name like '张%';

-- 聚合函数
select count(id) from tb_emp;

select count('A') from tb_emp;

select count(*) from tb_emp;

select min(entrydate) from tb_emp;

select max(entrydate) from tb_emp;

select avg(id) from tb_emp;

select sum(id) from tb_emp;

select gender,count(*) from tb_emp group by gender;

select job,count(*) from tb_emp where entrydate <= '2015-01-01' group by job having count(*) >= 2;

select * from tb_emp order by  entrydate, update_time desc;

-- 分页查询
select * from tb_emp limit 0,5;

select * from tb_emp limit 5,5;

select * from tb_emp limit 10,5;

-- 起始索引=（页码-1） * 每页展示记录数

-- 案例
select *
from tb_emp
where name like '%张%'
  and gender = 1
  and entrydate between '2000-01-01' and '2015-12-31'
order by tb_emp.update_time desc
limit 0,10;

-- 案例2
-- if(条件表达式，true，false)
select if(gender=1,'男性员工','女性员工') 性别,count(*) from tb_emp group by gender;

-- case 表达式 when 值1 then 结果1 when 值2 then 结果2
select
    (case job when 1 then '班主任' when 2 then '讲师' when 3 then '学工主管' when 4 then '教研主管' else '为分配职位' end) 职位,
    count(*)
from tb_emp
group by job;

-- 部门
create table tb_dept (
    id int unsigned primary key auto_increment comment 'ID',
    name varchar(10) not null unique comment '部门名称',
    create_time datetime not null comment '创建时间',
    update_time datetime not null comment '修改时间'
) comment '部门表';

insert into tb_dept (id, name, create_time, update_time)
values (1, '学工部', now(), now()),
       (2, '教研部', now(), now()),
       (3, '咨询部', now(), now()),
       (4, '就业部', now(), now()),
       (5, '人事部', now(), now());

INSERT INTO tb_emp
(id, username, password, name, gender, image, job, entrydate, dept_id, create_time, update_time)
VALUES (1, 'jinyong', '123456', '金庸', 1, '1.jpg', 4, '2000-01-01', 2, now(), now()),
       (2, 'zhangwuji', '123456', '张无忌', 1, '2.jpg', 2, '2015-01-01', 2, now(), now()),
       (3, 'yangxiao', '123456', '杨逍', 1, '3.jpg', 2, '2008-05-01', 2, now(), now()),
       (4, 'weiyixiao', '123456', '韦一笑', 1, '4.jpg', 2, '2007-01-01', 2, now(), now()),
       (5, 'changyuchun', '123456', '常遇春', 1, '5.jpg', 2, '2012-12-05', 2, now(), now()),
       (6, 'xiaozhao', '123456', '小昭', 2, '6.jpg', 3, '2013-09-05', 1, now(), now()),
       (7, 'jixiaofu', '123456', '纪晓芙', 2, '7.jpg', 1, '2005-08-01', 1, now(), now()),
       (8, 'zhouzhiruo', '123456', '周芷若', 2, '8.jpg', 1, '2014-11-09', 1, now(), now()),
       (9, 'dingminjun', '123456', '丁敏君', 2, '9.jpg', 1, '2011-03-11', 1, now(), now()),
       (10, 'zhaomin', '123456', '赵敏', 2, '10.jpg', 1, '2013-09-05', 1, now(), now()),
       (11, 'luzhangke', '123456', '鹿杖客', 1, '11.jpg', 1, '2007-02-01', 1, now(), now()),
       (12, 'hebiweng', '123456', '鹤笔翁', 1, '12.jpg', 1, '2008-08-18', 1, now(), now()),
       (13, 'fangdongbai', '123456', '方东白', 1, '13.jpg', 2, '2012-11-01', 2, now(), now()),
       (14, 'zhangsanfeng', '123456', '张三丰', 1, '14.jpg', 2, '2002-08-01', 2, now(), now()),
       (15, 'yulianzhou', '123456', '俞莲舟', 1, '15.jpg', 2, '2011-05-01', 2, now(), now()),
       (16, 'songyuanqiao', '123456', '宋远桥', 1, '16.jpg', 2, '2010-01-01', 2, now(), now()),
       (17, 'chenyouliang', '123456', '陈友谅', 1, '17.jpg', NULL, '2015-03-21', NULL, now(), now());

create table tb_user(
                        id int unsigned  primary key auto_increment comment 'ID',
                        name varchar(10) not null comment '姓名',
                        gender tinyint unsigned not null comment '性别, 1 男  2 女',
                        phone char(11) comment '手机号',
                        degree varchar(10) comment '学历'
) comment '用户信息表';

insert into tb_user values (1,'白眉鹰王',1,'18812340001','初中'),
                           (2,'青翼蝠王',1,'18812340002','大专'),
                           (3,'金毛狮王',1,'18812340003','初中'),
                           (4,'紫衫龙王',2,'18812340004','硕士');
create table tb_user_card(
                             id int unsigned  primary key auto_increment comment 'ID',
                             nationality varchar(10) not null comment '民族',
                             birthday date not null comment '生日',
                             idcard char(18) not null comment '身份证号',
                             issued varchar(20) not null comment '签发机关',
                             expire_begin date not null comment '有效期限-开始',
                             expire_end date comment '有效期限-结束',
                             user_id int unsigned not null unique comment '用户ID',
                             constraint fk_user_id foreign key (user_id) references tb_user(id)
) comment '用户信息表';

insert into tb_user_card values (1,'汉','1960-11-06','100000100000100001','朝阳区公安局','2000-06-10',null,1),
                                (2,'汉','1971-11-06','100000100000100002','静安区公安局','2005-06-10','2025-06-10',2),
                                (3,'汉','1963-11-06','100000100000100003','昌平区公安局','2006-06-10',null,3),
                                (4,'回','1980-11-06','100000100000100004','海淀区公安局','2008-06-10','2028-06-10',4);

create table tb_student(
                           id int auto_increment primary key comment '主键ID',
                           name varchar(10) comment '姓名',
                           no varchar(10) comment '学号'
) comment '学生表';
insert into tb_student(name, no) values ('黛绮丝', '2000100101'),('谢逊', '2000100102'),('殷天正', '2000100103'),('韦一笑', '2000100104');


create table tb_course(
                          id int auto_increment primary key comment '主键ID',
                          name varchar(10) comment '课程名称'
) comment '课程表';
insert into tb_course (name) values ('Java'), ('PHP'), ('MySQL') , ('Hadoop');


create table tb_student_course(
                                  id int auto_increment comment '主键' primary key,
                                  student_id int not null comment '学生ID',
                                  course_id  int not null comment '课程ID',
                                  constraint fk_courseid foreign key (course_id) references tb_course (id),
                                  constraint fk_studentid foreign key (student_id) references tb_student (id)
)comment '学生课程中间表';

insert into tb_student_course(student_id, course_id) values (1,1),(1,2),(1,3),(2,2),(2,3),(3,4);

create database db04;



