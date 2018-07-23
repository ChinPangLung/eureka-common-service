package com.example.rabbitmqhello.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: RabbitConfig
 * @Author: long-zp
 * @Date: 2018/7/23 17:12
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
