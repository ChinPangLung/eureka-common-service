package com.example.eurekabussnissserviceuserclientfegin.client;

import com.example.eurekabussnissserviceuserclientfegin.fallback.UserFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Title: UserFeignClient
 * @Author: long-zp
 * @Date: 2018/7/16 15:51
 * @version: V1.0
 * @Description: Created with IntelliJ IDEA.
 **/

/**
 * 标明feign调用的微服务名称
 */
//通过@ FeignClient（“服务名”），来指定调用哪个服务。
// 比如在代码中调用了service-hi服务的“/hi”接口，还可以使用url参数指定一个URL
// fallback  出现错误回调类
@FeignClient(name = "service-user",fallback = UserFallback.class)
public interface UserFeignClient {

    /**
     * 对应service-user微服务中的URL
     * @return
     */
    @GetMapping("/listUsers")
    String listUsers();

}
