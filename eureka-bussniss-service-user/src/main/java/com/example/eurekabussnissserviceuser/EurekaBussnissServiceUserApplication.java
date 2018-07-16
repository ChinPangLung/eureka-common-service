package com.example.eurekabussnissserviceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaBussnissServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBussnissServiceUserApplication.class, args);
    }
}
