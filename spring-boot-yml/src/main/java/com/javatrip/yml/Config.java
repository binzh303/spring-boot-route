package com.javatrip.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 12:03
 */
@Configuration
@ConfigurationProperties(prefix = "config")
@Data
public class Config {

    private String name;
    private String desc;
}
