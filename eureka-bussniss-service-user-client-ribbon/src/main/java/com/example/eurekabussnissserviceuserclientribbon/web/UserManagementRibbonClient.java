package com.example.eurekabussnissserviceuserclientribbon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.java.Log;
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
@Log
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
        /**
         * hystrix 断路器的默认的超时时间为2000毫秒
         * 这里测试的在3000毫秒的随机出现的超时概率出发断路器 对应的代码逻辑见service-user项目的listUsers接口
         */
        long start = System.currentTimeMillis();
        String result = this.restTemplate.getForObject("http://service-user/listUsers", String.class);
        long end = System.currentTimeMillis();
        log.info("Spend Time ："+(end-start));
        return result;
    }

    public String listUsersByRibbonFallback() {
        return "listUsersByRibbon异常，端口：" + port;
    }
}
