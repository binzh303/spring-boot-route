package com.javatrip.admin.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-08 11:30
 */
@RestController
public class TestController {

    @GetMapping("/get")
    public Person getPerson(){
        return new Person("zhbin",18);
    }
}
