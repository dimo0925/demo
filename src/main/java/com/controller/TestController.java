package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.MyTest;
import com.services.ITestServices;
import com.util.redis.RedisUtil;

@RestController
public class TestController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private ITestServices testService;

    @RequestMapping("/myTest")
    public List<MyTest> myTest(){
        redisUtil.hget("group","13");
        return testService.findAll();
    }
}
