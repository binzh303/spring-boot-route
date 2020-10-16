package com.javatrip.aop.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @Author 公众号：Java旅途
 * @Description person实体类
 * @Date 2020-08-28 11:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
}
