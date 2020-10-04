package com.javatrip.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 公众号：Java旅途
 * @Description 全局异常处理类
 * @Date 2020-08-18 10:42
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 查询结果为空时处理
     * @param e
     * @return
     */
    @ExceptionHandler(EmptyResutlException.class)
    public R emptyResultExceptionHandler(EmptyResutlException e){
        log.error("查询结果为空：{}",e.getMessage());
        R result = new R();
        result.fillCode(e.getCode(),e.getMessage());
        return result;
    }

    /**
     * 请求参数错误时处理
     * @param e
     * @return
     */
    @ExceptionHandler(RequestParamException.class)
    public R requestParamExceptionHandler(RequestParamException e){
        log.error("请求参数不合法：{}",e.getMessage());
        R result = new R();
        result.fillCode(e.getCode(),e.getMessage());
        return result;
    }

    /**
     * 处理其他异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception e){
        log.error("未知异常：{}",e.getMessage());
        R result = new R();
        result.fillCode(CodeEnum.ERROR);
        return result;
    }
}
