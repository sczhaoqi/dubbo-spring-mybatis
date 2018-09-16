package com.sc.zhaoqi.dsm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceProvider
{
    private ClassPathXmlApplicationContext applicationContext;

    public ServiceProvider()
    {
        this.applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public void run()
    {
        applicationContext.start();
    }

    public static void main(String[] args)
            throws Exception
    {
        new ServiceProvider().run();
        System.in.read(); // 按任意键退出
    }
}
