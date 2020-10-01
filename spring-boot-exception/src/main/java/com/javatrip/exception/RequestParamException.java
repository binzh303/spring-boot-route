package com.javatrip.exception;

import lombok.Data;

/**
 * @Author zhbin
 * @Description
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
}
