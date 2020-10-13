package com.javatrip.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * @Author 公众号：Java旅途
 * @Description 消费者
 * @Date 2020-09-13 16:53
 */
@Component
@Slf4j
@KafkaListener(topics = {"first-topic"},groupId = "test-consumer-group")
public class Consumer {

    @KafkaHandler()
    public void receive(String message){

        log.info("我是消费者，我接收到的消息是："+message);
    }
}
