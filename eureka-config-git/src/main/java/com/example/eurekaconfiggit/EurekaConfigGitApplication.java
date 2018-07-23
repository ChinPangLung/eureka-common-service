package com.example.eurekaconfiggit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EurekaConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigGitApplication.class, args);
    }
}
