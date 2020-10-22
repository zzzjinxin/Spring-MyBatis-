package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    //不需要User类和数据库表名一致，里面对象和我们数据库字段一样就行
    private int id;
    private String userCode;
    private String userName;
    private String userPassword;
    //添加角色名称字段
    private String roleName;
    private Date birthday;
    private String phone;
    private String address;
    private Integer userRole;


}
