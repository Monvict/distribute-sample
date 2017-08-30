package com.lotus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/23.
 */
@RestController
@EnableAutoConfiguration
public class Application {

    @Value("${content}")
    private String content;

    public String hello() {
        return "Hello, I am michle jacson." + content;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
