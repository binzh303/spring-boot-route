package com.javatrip.kafka.producer;

import java.util.Properties;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-13 14:57
 */
public class MyProducer {

    public static void main(String[] args) {

        // 创建kafka生产者的配置信息
        Properties properties = new Properties();
        // 指定kafka集群
        properties.put("bootstrap.servers","");

        //
        properties.put("acks","all");
        // 重试次数
        properties.put("retries",3);
        // 批次大小
        properties.put("batch.size",16384);
        // 等待时间
        properties.put("linger.ms",1);
        // 缓冲区大小
        properties.put("buffer.momery",33554432);
        // key/value序列话方式
        properties.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");

        // 创建生产者对象
        // 发送消息
        // 关闭资源
    }
}
