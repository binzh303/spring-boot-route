package com.javatrip.apidocs.entity;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author zhbin
 * @Description 用户类
 * @Date 2020-06-15 21:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -4797361578293076686L;

    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户年龄
     */
    @Ignore
    private int age;
}
