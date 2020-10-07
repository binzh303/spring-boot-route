package com.javatrip.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-10-04 14:36
 */

@RabbitListener(queues = RabbitConfig.queueNameA)
@Component
@Slf4j
public class ConsumerA {

    @RabbitHandler
    public void receive(String message){
        log.info("消费者A接收到的消息："+message);
    }
}
