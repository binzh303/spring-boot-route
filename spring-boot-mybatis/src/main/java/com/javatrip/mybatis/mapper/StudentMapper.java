package com.javatrip.mybatis.mapper;

import com.javatrip.mybatis.annocation.Student;
import org.apache.ibatis.annotations.*;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-09 11:00
 */
@Mapper
public interface StudentMapper {

    @Select("select * from student where student_id = #{id}")
    Student findById(@Param("id") Integer id);

    @Insert("insert into student(age,name) values(#{age},#{name})")
    int addStudent(@Param("name") String name,@Param("age") Integer age);

    @Update("update student set name = #{name} where student_id = #{studentId}")
    int updateStudent(@Param("studentId") Integer studentId,@Param("name") String name);

    @Delete("delete from student where student_id = #{studentId}")
    int deleteStudent(@Param("studentId") Integer studentId);
}
