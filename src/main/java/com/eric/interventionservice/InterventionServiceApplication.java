package com.eric.interventionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InterventionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterventionServiceApplication.class, args);
    }

}
