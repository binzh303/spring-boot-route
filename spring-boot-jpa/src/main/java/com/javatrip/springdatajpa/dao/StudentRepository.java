package com.javatrip.springdatajpa.dao;

import com.javatrip.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-09-09 19:00
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

    /**
     * 根据年龄，名字模糊查询
     * @return
     */
    Student findByNameLikeAndAge(String name,int age);
}
