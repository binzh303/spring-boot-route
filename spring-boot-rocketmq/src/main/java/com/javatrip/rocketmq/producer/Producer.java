package com.javatrip.rocketmq.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description 生产者
 * @Date 2020-10-07 22:19
 */
@RestController
public class Producer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("send")
    public void send(){

        rocketMQTemplate.convertAndSend("first-topic","你好,Java旅途");
    }
}
