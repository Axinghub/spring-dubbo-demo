package com.axing.service.impl;

import com.axing.dao.UserDao;
import com.axing.entity.UserInfo;
import com.axing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public int insertUserSerciceimpl(UserInfo userInfo) {
        userDao.insertUser(userInfo);
        System.out.println(userInfo.getId());
        return userInfo.getId();
    }
}
