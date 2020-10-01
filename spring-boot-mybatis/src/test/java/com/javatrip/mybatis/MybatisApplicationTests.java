package com.javatrip.mybatis;

import com.javatrip.mybatis.annocation.Student;
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
    void contextLoads() {

        Student student = xMapper.findById(13);
//
//        mapper.addStudent("Java旅途",19);
//        mapper.deleteStudent(13);
//        mapper.updateStudent(13,"Java旅途");
    }

}
