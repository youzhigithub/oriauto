package com.ori.oriauto.test.controller;

import com.ori.oriauto.user.api.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private UserServiceApi userServiceApi;

    @RequestMapping("/testFeign")
    public String testFeign(){
        return this.userServiceApi.userTest();
    }
}
