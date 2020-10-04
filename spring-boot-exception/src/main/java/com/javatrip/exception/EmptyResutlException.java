package com.javatrip.exception;

import lombok.Data;

/**
 * @Author 公众号：Java旅途
 * @Description 自定义异常，查询结果为空
 * @Date 2020-08-18 11:29
 */
@Data
public class EmptyResutlException extends RuntimeException {

    private static final long serialVersionUID = -8839210969758687047L;
    private int code;
    private String message;

    public EmptyResutlException(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
    }

    public EmptyResutlException(int code,String message){
        this.code = code;
        this.message = message;
    }
}
