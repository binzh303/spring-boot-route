package com.javatrip.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author 公众号：Java旅途
 * @Description 定时任务测试
 * @Date 2020-10-17 11:48
 */
@Slf4j
@Component
public class ScheduledTest {

    @Scheduled(cron = "*/1 * * * * ?")
    public void test1(){
        log.info("这是定时任务1----");
    }
    @Scheduled(cron = "*/1 * * * * ?")
    public void test2(){
        log.info("这是定时任务2----");
    }
}
