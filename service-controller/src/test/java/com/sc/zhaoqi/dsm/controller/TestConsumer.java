package com.sc.zhaoqi.dsm.controller;

import com.sc.zhaoqi.dsm.api.UserService;
import com.sc.zhaoqi.dsm.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/dubbo-consumer.xml"})
public class TestConsumer
{
    @Autowired
    UserService userService;
    @Test
    public void testUserService(){
        User user=userService.findById("1"); // 执行远程方法
        Assert.assertEquals(user.toString(),"User[id=1,name=1]");
    }
}
