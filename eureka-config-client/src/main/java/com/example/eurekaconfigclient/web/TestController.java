package com.example.eurekaconfigclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @Author: long-zp
 * @Date: 2018/7/23 11:39
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
@RefreshScope
public class TestController {
    @Value("${from}")
    private String from;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "from")
    public String from() {
        return this.from;
    }

    @RequestMapping(value = "fromByEnv")
    public String fromByEnv() {
        return this.environment.getProperty("from", "undefined");
    }
}
