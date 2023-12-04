package com.example.discovrysevrvice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class DiscovrySevrviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscovrySevrviceApplication.class, args);
    }


}
