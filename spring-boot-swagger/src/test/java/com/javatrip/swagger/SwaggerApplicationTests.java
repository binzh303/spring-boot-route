package com.javatrip.swagger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URLEncoder;

@SpringBootTest
class SwaggerApplicationTests {
    @Test
    void contextLoads() throws Exception {
        String str = "��";
        String strCode = new String(str.getBytes("UTF-8"), "GBK");
        System.out.println(strCode);
    }
}
