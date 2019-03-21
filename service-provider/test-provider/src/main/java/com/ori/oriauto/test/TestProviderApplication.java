package com.ori.oriauto.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.ori.oriauto"})
@EnableEurekaClient
@EnableFeignClients({"com.ori.oriauto"})
public class TestProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProviderApplication.class ,args);
    }
}
