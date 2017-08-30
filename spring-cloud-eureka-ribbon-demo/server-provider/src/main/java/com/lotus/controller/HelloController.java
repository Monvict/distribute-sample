package com.lotus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/28.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hllo " + name + ",i am from port:" + port;
    }
}
