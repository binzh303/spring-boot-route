package com.javatrip.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description 邮件发送
 * @Date 2020-10-19 14:52
 */
@RestController
public class Email {

    @Autowired
    private JavaMailSender mailSender;
    @GetMapping("send")
    private void send(){

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("zhbin303@126.com");
        // 收件人
        message.setTo("binzh303@163.com");
        // 邮件标题
        message.setSubject("Java发送邮件第二弹");
        // 邮件内容
        message.setText("你好，这是一条用于测试Spring Boot邮件发送功能的邮件！哈哈哈~~~");
        // 抄送人
        message.setCc("1062789205@qq.com");
        mailSender.send(message);
    }
}
