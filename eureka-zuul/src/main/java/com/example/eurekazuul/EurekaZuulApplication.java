package com.example.eurekazuul;

import com.example.eurekazuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/*@SpringBootApplication
@EnableEurekaClient*/
@EnableZuulProxy//注解@EnableZuulProxy以开启zuul特性
@SpringCloudApplication //使用@SpringCloudApplication包括，
// Springboot注解，注册服务到注册中心注解，熔断器注解
// 在SpringCloud看来这是每一微服务所必须应有的三个注解。这里所以才推出了@SpringCloudApplication注解
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }

    /**
     * 启用过滤器功能
     *
     * @return
     */
   /* @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }*/
}
