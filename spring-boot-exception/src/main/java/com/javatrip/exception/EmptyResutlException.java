package com.javatrip.exception;

import lombok.Data;

/**
 * @Author zhbin
 * @Description
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
}
