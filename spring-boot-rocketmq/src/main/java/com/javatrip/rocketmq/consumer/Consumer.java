package com.javatrip.rocketmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Author 公众号：Java旅途
 * @Description 消费者
 * @Date 2020-10-10 10:57
 */
@Component
@RocketMQMessageListener(topic = "first-topic",consumerGroup = "my-consumer-group")
@Slf4j
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("我收到消息了！消息内容为："+message);

    }
}
