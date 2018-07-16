package com.example.eurekabussnissserviceuserclientribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/listUsersByRibbon")
    public String ListUsersByRibbon(){
        String result = this.restTemplate.getForObject("http://service-user/listUsers", String.class);
        return result;
    }
}
