package com.javatrip.aop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 公众号：Java旅途
 * @Description 操作记录对象
 * @Date 2020-08-28 11:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysOperLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /** 日志主键 */
    private Long id;

    /** 操作模块 */
    private String title;

    /** 业务类型（0其它 1新增 2修改 3删除） */
    private Integer businessType;

    /** 请求方法 */
    private String method;

    /** 错误消息 */
    private String errorMsg;

    private Integer status;

    /** 操作时间 */
    private Date operTime;
}
