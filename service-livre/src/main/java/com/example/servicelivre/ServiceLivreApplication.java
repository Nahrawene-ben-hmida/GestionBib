package com.example.servicelivre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient

@SpringBootApplication
public class ServiceLivreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLivreApplication.class, args);
    }

}
