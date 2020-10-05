package com.javatrip.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 公众号：Java旅途
 * @Description person实体类
 * @Date 2020-08-28 11:25
 */
@ApiModel("用户实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty(value = "年龄")
    private int age;
}
