package com.aaa.service.impl;

import com.aaa.dao.UserDao;
import com.aaa.entity.User;
import com.aaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：jinxin
 * @date ：Created in 2020/10/12 13:54
 * @version: $
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }

    @Override
    public List<User> findByName(User user) {
        return userDao.findByName(user);
    }
}
