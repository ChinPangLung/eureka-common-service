package com.example.rabbitmqhello.web;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Title: Sender
 * @Author: long-zp
 * @Date: 2018/7/23 17:03
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 *
 * 创建消息生产者，通过注入AmqpTemplate接口实例来实现消息的发送。AmqpTemplate接口定义了一套针对AMQP协议的基础操作
 *
 **/
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender : " + context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
