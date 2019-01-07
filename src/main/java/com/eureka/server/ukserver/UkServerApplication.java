package com.eureka.server.ukserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UkServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UkServerApplication.class, args);
    }

}

