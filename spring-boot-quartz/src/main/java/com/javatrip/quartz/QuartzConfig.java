package com.javatrip.quartz;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @Author 公众号：Java旅途
 * @Description 创建一个定时任务
 * @Date 2020-10-18 13:21
 */
@Configuration
public class QuartzConfig {

    @Autowired
    private Scheduler scheduler;
    @Bean
    public void config() throws SchedulerException {

        JobDetail jobDetail = JobBuilder.newJob(SimpleJob.class)
                // 任务标识，及任务分组
                .withIdentity("job1", "group1")
                // 链接调用，增加需要的参数
                .usingJobData("name","Java旅途")
                .usingJobData("age",18)
                .build();

        SimpleTrigger simpleTrigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1", "group1")
                // 立即执行
                .startNow()
                // 10s后停止
                .endAt(new Date(System.currentTimeMillis()+10*1000))
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                // 每秒执行一次
                                .withIntervalInSeconds(1)
                                // 一直执行
                                .repeatForever()
                )
                .build();

        scheduler.scheduleJob(jobDetail,simpleTrigger);
    }
}
