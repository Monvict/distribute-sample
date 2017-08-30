package com.lotus.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/8/28.
 * 使用RestTemplate + Ribbon的方式做访问的负载均衡
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "dealError") //当发生错误时的容错方法
    public String helloService(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name, String.class);
    }

    /**
     * 当发生错误时的容错方法
     */
    public String dealError(String name){
        return "Sorry," + name + " an error happended in service ribbon.";
    }
}
