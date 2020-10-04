package com.javatrip.exception;

import lombok.Data;

/**
 * @Author 公众号：Java旅途
 * @Description 自定义异常，请求参数不合法
 * @Date 2020-08-18 14:22
 */
@Data
public class RequestParamException extends RuntimeException {

    private static final long serialVersionUID = 4748844811214637041L;
    private int code;
    private String message;

    public RequestParamException(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    public RequestParamException(int code,String message){
        this.code = code;
        this.message = message;
    }
}
