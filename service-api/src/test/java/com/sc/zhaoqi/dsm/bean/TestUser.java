package com.sc.zhaoqi.dsm.bean;

import org.junit.Assert;
import org.junit.Test;

public class TestUser
{
    @Test
    public void toStringTest(){
        User user = new User();
        user.setId("1");
        user.setName("1");
        Assert.assertEquals(user.toString(),"User[id=1,name=1]");
    }
}
