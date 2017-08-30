package com.lotus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2017/8/28.
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApp.class, args);
    }
}
