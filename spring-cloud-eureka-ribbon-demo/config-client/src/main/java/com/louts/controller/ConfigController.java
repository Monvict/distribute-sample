package com.louts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/29.
 */
@RestController
@RefreshScope
// 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
// 通过 curl -X POST http://192.168.100.181:9527/refresh 后，在页面上就能获取到配置文件的最新值
public class ConfigController {

    @Value("${lotus.hello}")
    private String message;

    @RequestMapping("/message")
    public String getMessage(){
        return "Hello + " + message;
    }
}
