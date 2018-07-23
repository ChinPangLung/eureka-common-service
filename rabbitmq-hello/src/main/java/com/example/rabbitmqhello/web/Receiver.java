package com.example.rabbitmqhello.web;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Title: Receiver
 * @Author: long-zp
 * @Date: 2018/7/23 17:07
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 * 创建消息消费者Receiver 通过RabbitListener注解定义该类的hello队列的监听，
 * 并使用RabbitHandler注解来指定对消息的处理方法。所以该消费者实现了对hello的队列消费。
 * 消费操作为输出消息的字符串内容
 **/
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
