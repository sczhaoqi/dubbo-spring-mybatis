package com.sc.zhaoqi.dsm.controller;

import com.sc.zhaoqi.dsm.api.UserService;
import com.sc.zhaoqi.dsm.bean.ResponseBean;
import com.sc.zhaoqi.dsm.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public  @ResponseBody ResponseBean searchById(@RequestParam("id") String id)
    {
        User user = userService.findById(id);
        return ResponseBean.success("success", user);
    }
}
