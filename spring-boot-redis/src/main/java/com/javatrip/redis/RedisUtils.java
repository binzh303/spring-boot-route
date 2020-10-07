package com.javatrip.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.CachedExpressionEvaluator;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.TimeoutUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-03 22:30
 */
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 普通存入
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key,Object value){
        try {
            redisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 普通获取key
     * @param key
     * @return
     */
    public Object get(String key){
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 存入key，设置过期时长
     * @param key
     * @param value
     * @param time
     * @return
     */
    public boolean set(String key,Object value,long time){
        try {
            if(time > 0){
                redisTemplate.opsForValue().set(key,value,time, TimeUnit.SECONDS);
            }else{
                redisTemplate.opsForValue().set(key,value);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean exists(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除key
     * @param key
     */
    public void del(String key){
        try {
            if(key != null && key.length() > 0){
                redisTemplate.delete(key);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
