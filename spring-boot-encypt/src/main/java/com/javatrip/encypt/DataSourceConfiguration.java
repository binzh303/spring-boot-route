package com.javatrip.encypt;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author 公众号：Java旅途
 * @Description 自定义数据源解密配置文件信息
 * @Date 2020-09-07 11:47
 */
@Configuration
public class DataSourceConfiguration {

    @Autowired
    DataSourceProperties properties;

    @Bean
    public DataSource dataSource() throws Exception{

        String username = Des3.decryptThreeDESECB(properties.getUsername(),Des3.DES3KEY);
        String password = Des3.decryptThreeDESECB(properties.getPassword(),Des3.DES3KEY);
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(properties.getDriverClassName());
        dataSource.setJdbcUrl(properties.getUrl());
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
