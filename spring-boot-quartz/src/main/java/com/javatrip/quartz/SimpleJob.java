package com.javatrip.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @Author 公众号：Java旅途
 * @Description 定时任务类
 * @Date 2020-10-18 12:10
 */
@Slf4j
public class SimpleJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("job execute---"+new Date());
    }
}
