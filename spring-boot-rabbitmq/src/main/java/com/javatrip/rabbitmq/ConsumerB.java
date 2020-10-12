package com.javatrip.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author 公众号：Java旅途
 * @Description 消费者B
 * @Date 2020-10-04 14:43
 */
@RabbitListener(queues = RabbitConfig.queueNameB)
@Component
@Slf4j
public class ConsumerB {

    @RabbitHandler
    public void receive(String message){
        log.info("消费者B接收到的消息："+message);
    }
}
