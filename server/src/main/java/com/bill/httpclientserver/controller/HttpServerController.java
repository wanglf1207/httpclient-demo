package com.bill.httpclientserver.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HttpServerController {

    @RequestMapping("/doGetMethod1")
    @ResponseBody
    public String doGetMethod1() {
        return "123";
    }

    @RequestMapping(value = "/doPostMethod1", method = RequestMethod.POST)
    public User doPost() {
        User user = new User();
        user.setUserName("测试用户");
        return user;
    }
}
