package com.javatrip.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-03 18:30
 */
@RestController
@Slf4j
public class RedisDemo {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("redisTmeplateData")
    public void redisTemplateData(){

        redisTemplate.opsForValue().set("name","Java旅途");
    }

    @GetMapping("stringRedisTemplateData")
    public void stringRedisTemplateData(){

        stringRedisTemplate.opsForValue().set("desc","坚持分享java技术栈");
    }

    @GetMapping("getStudent")
    @Cacheable(value = "student:key")
    public Student getStudent(){
        log.info("我不是缓存，我是new的对象！");
        Student student = new Student("Java旅途",26);
        return student;
    }
}
