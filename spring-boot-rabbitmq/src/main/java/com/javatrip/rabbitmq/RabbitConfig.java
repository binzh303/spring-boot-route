package com.javatrip.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-10-04 13:56
 */
@Configuration
public class RabbitConfig {

    final static String queueNameA = "first-queue";
    final static String queueNameB = "second-queue";
    final static String exchangeName = "first-fanout-exchange";

    /***
     * 定义一个队列，设置队列属性
     * @return
     */
    @Bean("queueA")
    public Queue queueA(){

        Map<String,Object> map = new HashMap<>();
        // 消息过期时长，10秒过期
        map.put("x-message-ttl",10000);
        // 队列中最大消息条数，10条
        map.put("x-max-length",10);
        // 第一个参数，队列名称
        // 第二个参数，durable：持久化
        // 第三个参数，exclusive：排外的，
        // 第四个参数，autoDelete：自动删除
        Queue queue = new Queue(queueNameA,true,false,false,map);
        return queue;
    }
    @Bean("queueB")
    public Queue queueB(){

        Map<String,Object> map = new HashMap<>();
        // 消息过期时长，10秒过期
        map.put("x-message-ttl",10000);
        // 队列中最大消息条数，10条
        map.put("x-max-length",10);
        // 第一个参数，队列名称
        // 第二个参数，durable：持久化
        // 第三个参数，exclusive：排外的，
        // 第四个参数，autoDelete：自动删除
        Queue queue = new Queue(queueNameB,true,false,false,map);
        return queue;
    }

    /***
     * 定义一个扇形交换机
     * @return
     */
    @Bean
    public FanoutExchange fanoutExchange(){

        // 第一个参数，交换机名称
        // 第二个参数，durable，是否持久化
        // 第三个参数，autoDelete，是否自动删除
        FanoutExchange fanoutExchange = new FanoutExchange(exchangeName,true,false);
        return fanoutExchange;
    }

    /***
     * 将队列和交换机绑定
     * @return
     */
    @Bean
    public Binding bindingA(@Qualifier("queueA") Queue queueA, FanoutExchange fanoutExchange){
        Binding binding = BindingBuilder.bind(queueA).to(fanoutExchange);
        return binding;
    }

    @Bean
    public Binding bindingB(@Qualifier("queueB") Queue queueB,FanoutExchange fanoutExchange){
        Binding binding = BindingBuilder.bind(queueB).to(fanoutExchange);
        return binding;
    }
}
