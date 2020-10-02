package com.javatrip.yml;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author 公众号：Java旅途
 * @Description
 * @Date 2020-10-02 12:02
 */

@RestController
public class GetConfigurationProperties {

    @Autowired
    private Config config;

    @Autowired
    private Configs configs;
    @Autowired
    GetValue getValue;

    @GetMapping("/getConfig")
    public String getConfig(){
        return config.getName()+";"+config.getDesc();
    }

    @GetMapping("/getConfigs")
    public String getConfigs(){

        String content = "";
        List<Configs.Config> configList = configs.getConfig();
        Map<String,Object> map = new HashMap<>();
        for (Configs.Config bean : configList){
            content += bean.getName()+";"+bean.getDesc()+"，";
        }
        return content;
    }
}
