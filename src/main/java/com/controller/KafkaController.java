package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @RequestMapping("/sendTest")
    public String sendKafka(){
        try{
            kafkaTemplate.send("test","这是测试数据");
        }catch(Exception e){
            return "发送失败";
        }
        return "发送成功";
    }
}