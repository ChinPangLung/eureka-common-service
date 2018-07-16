package com.example.eurekabussnissserviceuserclientfegin.api;

import com.example.eurekabussnissserviceuserclientfegin.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: UserFeignApi
 * @Author: long-zp
 * @Date: 2018/7/16 15:53
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@RestController
public class UserFeignApi {
    /**
     * 将刚才定义的userFeignClient注入，并当成普通的接口调用即可
     */
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/listUsersByFeign")
    public String ListUsers(){
        String users = this.userFeignClient.listUsers();
        return users;
    }
}
