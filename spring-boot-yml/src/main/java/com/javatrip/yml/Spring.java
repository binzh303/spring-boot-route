package com.javatrip.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 15:05
 */
@Data
@Configuration
@PropertySource(value = {"classpath:test.yml"},encoding = "gbk")
@ConfigurationProperties(prefix = "spring")
public class Spring {

    private String value;
    private String remark;
}
