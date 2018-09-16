package com.sc.zhaoqi.dsm.mapper;

import com.sc.zhaoqi.dsm.bean.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface UserMapper
{
    User findById(String id);
}
