package com.louts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/8/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CofigClientApp {
    public static void main(String[] args) {
        SpringApplication.run(CofigClientApp.class, args);
    }
}
