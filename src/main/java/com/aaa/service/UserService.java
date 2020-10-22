package com.aaa.service;

import com.aaa.entity.User;

import java.util.List;

public interface UserService {
    //查询所有的用户信息
    public List<User> listAll();
    //查询当前用户名是XX的角色是xx的信息
    public List<User> findByName( User user);
}
