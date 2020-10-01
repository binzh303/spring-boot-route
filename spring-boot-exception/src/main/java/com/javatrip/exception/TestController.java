package com.javatrip.exception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-08-18 14:31
 */
@RestController
public class TestController {

    @GetMapping("getString")
    public R getString(String name){

        if("".equals(name)){
            throw new RequestParamException(CodeEnum.ERROR_INCOMPLETE_RESULT);
        }else if ("Java旅途".equals(name)) {
            throw new EmptyResutlException(CodeEnum.ERROR_EMPTY_RESULT);
        }
        return new R().fillData(name);
    }
}
