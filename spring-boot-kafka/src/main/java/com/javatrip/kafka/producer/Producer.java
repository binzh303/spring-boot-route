package com.javatrip.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-13 14:57
 */
@RestController
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("send")
    public void send(){

        String message = "你好，我是Java旅途";
        // 第一个参数 topic
        // 第二个参数 消息
        kafkaTemplate.send("first-topic",message);

    }
}
