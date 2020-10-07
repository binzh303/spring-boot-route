package com.javatrip.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-10-03 21:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = -5271483134248380084L;
    private String name;
    private int age;
}
