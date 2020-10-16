package com.javatrip.aop.annotation;

import com.javatrip.aop.enums.BusinessType;
import java.lang.annotation.*;

/**
 * @Author 公众号：Java旅途
 * @Description 自定义注解
 * @Date 2020-08-28 11:29
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    String title() default "";

    /**
     * 功能
     */
    BusinessType businessType() default BusinessType.OTHER;
}
