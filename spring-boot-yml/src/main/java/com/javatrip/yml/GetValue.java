package com.javatrip.yml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 11:31
 */
@RestController
public class GetValue {

    @Value("${config.name}")
    private String name;

    @Value("${config.desc}")
    private String desc;

    @GetMapping("getValue")
    public String getValue(){
        return "name="+name+";desc="+desc;
    }
}
