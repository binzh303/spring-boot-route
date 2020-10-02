package com.javatrip.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 12:39
 */
@Component
@ConfigurationProperties(prefix = "configarr")
@Data
public class Configs {

    private List<Config> config = new ArrayList<>();

    @Data
    public static class Config{

        private String name;
        private String desc;
    }
}
