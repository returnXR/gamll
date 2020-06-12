package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserServier;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserServier {

    @Autowired
    UserMapper userMapper;
}
