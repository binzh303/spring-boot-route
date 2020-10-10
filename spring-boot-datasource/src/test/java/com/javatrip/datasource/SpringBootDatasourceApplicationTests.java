package com.javatrip.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringBootDatasourceApplicationTests {


    @Autowired
    private JdbcTemplate db1JdbcTemplate;
    @Autowired
    private JdbcTemplate db2JdbcTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {

        db1JdbcTemplate.update("insert into student(name,age) values(?,?)",new Object[]{"Java旅途",18});
        db2JdbcTemplate.update("insert into student(name,age) values(?,?)",new Object[]{"Java旅途",18});
    }

    @Test
    void testPrimary() {
        jdbcTemplate.update("insert into student(name,age) values(?,?)",new Object[]{"Java旅途",18});
    }
}
