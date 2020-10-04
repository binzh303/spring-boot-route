package com.javatrip.exception;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author 公众号：Java旅途
 * @Description 测试自定义异常
 * @Date 2020-08-18 14:31
 */
@RestController
public class TestController {

    @GetMapping("getString")
    public R getString(String name){

        if(StringUtils.isEmpty(name)){
            throw new RequestParamException(1002,"请求参数name为空");
        }else if ("Java旅途".equals(name)) {
            // 这里没有查询操作，当请求参数是Java旅途的时候，模拟成查询结果为空
            throw new EmptyResutlException(1001,"查询结果为空");
        }
        // 这里模拟一下除自定义异常外的其他两种异常
        int i = 0;
        i = 5/i;
        return new R().fillData(name);
    }
}
