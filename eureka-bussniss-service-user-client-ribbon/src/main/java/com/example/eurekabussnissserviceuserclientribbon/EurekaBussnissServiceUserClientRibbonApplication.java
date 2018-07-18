package com.example.eurekabussnissserviceuserclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //注解以开启 Hystrix 特性
public class EurekaBussnissServiceUserClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBussnissServiceUserClientRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced //开启客户端负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
