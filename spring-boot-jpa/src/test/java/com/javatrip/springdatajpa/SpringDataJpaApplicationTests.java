package com.javatrip.springdatajpa;

import com.javatrip.springdatajpa.dao.StudentRepository;
import com.javatrip.springdatajpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringDataJpaApplicationTests {

    @Autowired
    StudentRepository repository;
    @Test
    void contextLoads() {

        // 查询所有实体
        List<Student> all = repository.findAll();
        // 根据id查询实体类
        Optional<Student> byId = repository.findById(100);
        // 根据id删除数据
        repository.deleteById(100);
        // 插入一条数据
        // 如果数据库存在该实体的主键，则更新，否则插入
        Student student = new Student();
        student.setAge(18);
        student.setName("Java旅途");
        repository.save(student);

        repository.findByNameLikeAndAge("Java",18);
    }
}
