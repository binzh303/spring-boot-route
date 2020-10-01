package com.javatrip.springdatajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-09 10:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 6712540741269055064L;

    @Id
    @GenericGenerator(name="idGenerator",strategy = "com.javatrip.springdatajpa.entity.MyGenerator")
    @GeneratedValue(generator = "idGenerator")
    private Integer studentId;
    private Integer age;
    private String name;
    private Integer sex;
    private Date createTime;
    private Integer status;
}
