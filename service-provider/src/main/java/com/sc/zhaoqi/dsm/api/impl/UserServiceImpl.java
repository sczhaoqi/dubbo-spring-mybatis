package com.sc.zhaoqi.dsm.api.impl;

import com.sc.zhaoqi.dsm.api.UserService;
import com.sc.zhaoqi.dsm.bean.User;
import com.sc.zhaoqi.dsm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    public User findById(String id)
    {
        return userMapper.findById(id);
    }
}
