package com.example.eurekahystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class EurekaHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboardApplication.class, args);
    }
}
