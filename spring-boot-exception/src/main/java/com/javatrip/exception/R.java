package com.javatrip.exception;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-08-18 10:49
 */
@Slf4j
@Data
public class R<T> implements Serializable {

    private static final long serialVersionUID = 572235155491705152L;
    /**
     * 响应的状态码
     */
    private int code;
    /***
     * 响应的信息
     */
    private String message;
    /**
     * 响应数据
     */
    private T data;

    /**
     * 放入响应码并返回
     * @param code
     * @param msg
     * @return
     */
    public R fillCode(int code,String msg){
        this.code = code;
        this.message = msg;
        return this;
    }

    /**
     * 放入响应码并返回
     * @param codeEnum
     * @return
     */
    public R fillCode(CodeEnum codeEnum){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        return this;
    }

    /**
     * 放入数据并响应成功状态
     * @param data
     * @return
     */
    public R fillData(T data){
        this.code = CodeEnum.SUCCESS.getCode();
        this.message = CodeEnum.SUCCESS.getMessage();
        this.data = data;
        return this;
    }
}
