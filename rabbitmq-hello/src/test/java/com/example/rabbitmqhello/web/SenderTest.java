package com.example.rabbitmqhello.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Title: SenderTest
 * @Author: long-zp
 * @Date: 2018/7/23 17:15
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SenderTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}