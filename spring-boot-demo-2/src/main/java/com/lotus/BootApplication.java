package com.lotus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2017/8/23.
 */
@SpringBootApplication
@ImportResource(value = "ApplicationContext.xml")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
