package com.javatrip.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 公众号：Java旅途
 * @Description 数据库对应实体类
 * @Date 2020-09-09 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 6712540741269055064L;

    private Integer studentId;
    private Integer age;
    private String name;
    private Integer sex;
    private Date createTime;
    private Integer status;
}
