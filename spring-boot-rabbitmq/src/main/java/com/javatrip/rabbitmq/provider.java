package com.javatrip.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-10-04 14:44
 */
@RestController
public class provider {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("send")
    public void sendMessage(){

        String message = "你好，我是Java旅途";
        rabbitTemplate.convertAndSend(RabbitConfig.exchangeName,null,message);
    }
}
