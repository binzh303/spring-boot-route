package com.javatrip.aop.service;

import com.javatrip.aop.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author 公众号：Java旅途
 * @Description 异步存储操作日志
 * @Date 2020-08-28 11:29
 */
@Service
public class AsyncLogService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog log) {

        String sql = "INSERT INTO sys_oper_log(title,business_type,method,STATUS,error_msg,oper_time) VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{log.getTitle(),log.getBusinessType(),log.getMethod(),log.getStatus(),log.getErrorMsg(),new Date()});
    }
}
