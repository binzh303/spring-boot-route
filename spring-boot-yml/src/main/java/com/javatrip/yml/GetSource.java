package com.javatrip.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 15:06
 */
@RestController
public class GetSource {

    @Autowired
    private Spring spring;

    @GetMapping("get")
    public String getSource(){
        return spring.getRemark()+";"+spring.getValue();
    }
}
