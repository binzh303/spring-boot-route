package com.javatrip.file;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.MultipartConfigElement;

/**
 * @Author zhbin
 * @Description
 * @Date 2020-08-17 18:13
 */
@Configuration
public class FileConfig implements WebMvcConfigurer {

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个文件大小
        factory.setMaxFileSize(DataSize.parse("10240MB"));
        // 上传的总文件大小
        factory.setMaxRequestSize(DataSize.parse("20480MB"));
        return factory.createMultipartConfig();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("file:"+"D:/uploadfile/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/");
    }
}
