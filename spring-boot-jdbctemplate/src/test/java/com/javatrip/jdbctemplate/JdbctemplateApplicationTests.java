package com.javatrip.jdbctemplate;

import com.javatrip.jdbctemplate.student.StudentBean;
import com.javatrip.jdbctemplate.student.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JdbctemplateApplicationTests {

    @Autowired
    StudentDao studentDao;
    @Test
    void contextLoads() {
//        StudentBean student = studentDao.getStudent(0);
//        System.out.println(student);
////
//        List<StudentBean> studentBeans = studentDao.studentBeanList(0);
//        System.out.println(studentBeans);

//        int i = studentDao.deleteStudent(0);
//        System.out.println(i);
//        studentDao.updateStudent(13,"Java旅途");
//
//        studentDao.addStudent();

        int i = studentDao.batchAddStudent();
        System.out.println(i);
    }

}
