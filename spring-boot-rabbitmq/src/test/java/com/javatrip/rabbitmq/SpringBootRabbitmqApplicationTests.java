package com.javatrip.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRabbitmqApplicationTests {

    @Autowired
    provider provider;
    @Test
    void contextLoads() {

        provider.sendMessage();
    }

}
