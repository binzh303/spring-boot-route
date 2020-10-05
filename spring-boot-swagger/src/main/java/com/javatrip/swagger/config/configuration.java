package com.javatrip.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 公众号：Java旅途
 * @Description 配置swagger2生成接口文档
 * @Date 2020-08-28 10:57
 */
@EnableSwagger2
@Configuration
public class configuration {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 需要生产文档的包配置
                .apis(RequestHandlerSelectors.basePackage("com.javatrip.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                // 标题
                .title("某某项目接口文档")
                // 描述
                .description("swagger2接口文档使用演示")
                // 版本
                .version("1.0")
                // 许可证
                .license("MIT")
                // 许可证地址
                .licenseUrl("www.xx.com")
                // 服务端地址
                .termsOfServiceUrl("https://www.cnblogs.com/zhixie/")
                // 联系信息
                .contact(new Contact("Java旅途","https://www.cnblogs.com/zhixie/","123@163.com"))
                .build();
    }
}
