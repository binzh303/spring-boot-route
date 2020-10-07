package com.javatrip.mybatis;

import com.javatrip.mybatis.entity.Student;
import com.javatrip.mybatis.mapper.StudentMapper;
import com.javatrip.mybatis.mapper.StudentXMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    StudentMapper mapper;

    @Autowired
    StudentXMapper xMapper;

    @Test
    void testMapper() {

        Student student = mapper.findById(10);
        mapper.addStudent("Java旅途",19);
        mapper.deleteStudent(31);
        mapper.updateStudent(10,"Java旅途");
    }

    @Test
    void contextLoads() {

        Student student = xMapper.findById(10);
        Student studentDo = new Student();
        studentDo.setAge(18);
        studentDo.setName("Java旅途呀");
        xMapper.addStudent(studentDo);
        xMapper.deleteStudent(32);
        xMapper.updateStudent(31,"Java旅途");
    }
}