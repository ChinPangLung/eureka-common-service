package com.example.eurekabussnissserviceuserclientfegin.fallback;

import com.example.eurekabussnissserviceuserclientfegin.client.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Title: UserFallback
 * @Author: long-zp
 * @Date: 2018/7/17 11:10
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/
@Component
public class UserFallback implements UserFeignClient {
    @Override
    public String listUsers() {
        return "服务调用失败";
    }
}
