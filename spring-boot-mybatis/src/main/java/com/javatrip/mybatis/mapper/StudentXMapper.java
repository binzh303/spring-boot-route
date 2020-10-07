package com.javatrip.mybatis.mapper;

import com.javatrip.mybatis.entity.Student;
import org.apache.ibatis.annotations.*;

/**
 * @Author 公众号：Java旅途
 * @Description xml对应mapper层
 * @Date 2020-09-09 15:55
 */
@Mapper
public interface StudentXMapper {

    Student findById(@Param("studentId") Integer studentId);

    int addStudent(Student student);

    int updateStudent(@Param("studentId") Integer studentId,@Param("name") String name);

    int deleteStudent(@Param("studentId") Integer studentId);
}
