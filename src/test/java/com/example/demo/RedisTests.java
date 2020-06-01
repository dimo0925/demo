package com.example.demo;

import com.util.redis.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RedisTests {
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void redisTest01(){
        boolean result=redisUtil.lSet("1","1000");
        Assert.assertTrue("插入失败",result);
    }

    @Test
    public void redisTest02(){
        boolean result=redisUtil.lSet("2","1001", 1000);
        Assert.assertTrue("插入失败",result);
    }

    @Test
    public void redisTest03(){
        List<String> list=new ArrayList<>();
        list.add("1002");
        redisUtil.lSet("1",list,500);
        List<Object> result=redisUtil.lGet("1",0,1);
        Assert.assertNotNull("查询失败", result);
    }

    @Test
    public void redisTest04(){
        boolean result=redisUtil.hset("1","10","1000");
        Assert.assertTrue("插入失败",result);
    }

    @Test
    public void redisTest05(){
        boolean result=redisUtil.hset("2","11", "1001", 1000);
        Assert.assertTrue("插入失败",result);
    }
}
