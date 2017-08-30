package com.lotus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2017/8/23.
 */
@EnableAutoConfiguration
@ComponentScan
@ImportResource(value = "ApplicationContext.xml")
@ServletComponentScan
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
