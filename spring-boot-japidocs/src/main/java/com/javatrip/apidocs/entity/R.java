package com.javatrip.apidocs.entity;

import java.io.Serializable;

/**
* @ClassName: R
* @Description: 响应信息封装
* @Author: 公众号：Java旅途
* @CreateDate: 2020/10/6 0:01
* @Version: 1.0
*/
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;

    private String msg;

    private T data;

    public static <T> R<T> ok()
    {
        return restResult(null, Constants.SUCCESS, null);
    }

    public static <T> R<T> ok(T data)
    {
        return restResult(data, Constants.SUCCESS, null);
    }

    public static <T> R<T> ok(T data, String msg)
    {
        return restResult(data, Constants.SUCCESS, msg);
    }

    public static <T> R<T> failed()
    {
        return restResult(null, Constants.FAIL, null);
    }

    public static <T> R<T> failed(String msg)
    {
        return restResult(null, Constants.FAIL, msg);
    }

    public static <T> R<T> failed(T data)
    {
        return restResult(data, Constants.FAIL, null);
    }

    public static <T> R<T> failed(T data, String msg)
    {
        return restResult(data, Constants.FAIL, msg);
    }

    public static <T> R<T> failed(int code, String msg)
    {
        return restResult(null, code, msg);
    }

    private static <T> R<T> restResult(T data, int code, String msg)
    {
        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
