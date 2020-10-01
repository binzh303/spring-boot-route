package com.javatrip.mybatis.mapper;

import com.javatrip.mybatis.annocation.Student;
import org.apache.ibatis.annotations.*;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-09 15:55
 */
@Mapper
public interface StudentXMapper {

    Student findById(@Param("id") Integer id);

    int addStudent(@Param("name") String name,@Param("age") Integer age);

    int updateStudent(@Param("studentId") Integer studentId,@Param("name") String name);

    int deleteStudent(@Param("studentId") Integer studentId);
}
