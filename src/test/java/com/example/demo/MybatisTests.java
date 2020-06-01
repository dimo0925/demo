package com.example.demo;

import com.dao.MyTestDao;
import com.entity.MyTest;
import com.util.redis.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
//加载主启动类
@SpringBootTest(classes = DemoApplication.class)
public class MybatisTests {

	//依赖注入
	@Autowired
	private MyTestDao mapper;

	@Test
	public void mybatisTest(){
		//先获取所有数据
		List<MyTest> userList = mapper.findAll();
		for (MyTest test : userList) {
			System.out.println(test);
		}
	}




}