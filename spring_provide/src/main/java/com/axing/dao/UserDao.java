package com.axing.dao;

import com.axing.entity.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int insertUser(UserInfo userInfo);
}
