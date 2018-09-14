package com.example.eurekahystrixdashboardturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
@EnableEurekaClient
public class EurekaHystrixDashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboardTurbineApplication.class, args);
    }
}
