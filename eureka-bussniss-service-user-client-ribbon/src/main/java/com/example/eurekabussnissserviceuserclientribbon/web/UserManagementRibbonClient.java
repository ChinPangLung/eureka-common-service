package com.example.eurekabussnissserviceuserclientribbon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: UserManagementRibbonClient
 * @Author: long-zp
 * @Date: 2018/7/16 15:27
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
public class UserManagementRibbonClient {

    @Value("${server.port}")
    private String port;

    @Autowired
    RestTemplate restTemplate;

    /**
     * 使用 @HystrixCommand 注解的 fallbackMethod 指定失败方法，并实现该方法
     *
     * @return
     */
    @GetMapping("/listUsersByRibbon")
    @HystrixCommand(fallbackMethod = "listUsersByRibbonFallback")
    public String ListUsersByRibbon() {
        String result = this.restTemplate.getForObject("http://service-user/listUsers", String.class);
        return result;
    }

    public String listUsersByRibbonFallback() {
        return "listUsersByRibbon异常，端口：" + port;
    }
}
