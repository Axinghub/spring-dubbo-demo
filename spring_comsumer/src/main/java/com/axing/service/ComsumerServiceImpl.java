package com.axing.service.impl;

import com.axing.entity.UserInfo;
import com.axing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComsumerServiceImpl {

    @Autowired
    UserService userService;

    public void userInsert(){
        UserInfo userInfo = new UserInfo("小明",12,"1234567890","南京");
        userService.insertUserSerciceimpl(userInfo);
    }
}
