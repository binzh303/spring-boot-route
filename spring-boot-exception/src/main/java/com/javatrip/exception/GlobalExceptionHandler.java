package com.javatrip.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-08-18 10:42
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    public R exceptionHandler(Exception e){
        R result = new R();
        log.error("捕获到了全局异常，异常信息为{}",e.getMessage());
        if(e instanceof EmptyResutlException){
            result.fillCode(((EmptyResutlException) e).getCode(),e.getMessage());
        }else if(e instanceof RequestParamException){
            result.fillCode(((RequestParamException) e).getCode(),e.getMessage());
        }else{
            result.fillCode(CodeEnum.ERROR);
        }
        return result;
    }

//    @ExceptionHandler(EmptyResutlException.class)
//    public R emptyResultExceptionHandler(EmptyResutlException e){
//        R result = new R();
//        result.fillCode(e.getCode(),e.getMessage());
//        return result;
//    }
//
//    @ExceptionHandler(RequestParamException.class)
//    public R requestParamExceptionHandler(RequestParamException e){
//        R result = new R();
//        result.fillCode(e.getCode(),e.getMessage());
//        return result;
//    }
//    @ExceptionHandler(Exception.class)
//    public R ExceptionHandler(Exception e){
//        R result = new R();
//        result.fillCode(CodeEnum.ERROR);
//        return result;
//    }
}
