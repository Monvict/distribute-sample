package com.lotus.controller;

import com.lotus.service.SchedualServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/29.
 * 在浏览器中访问/hello?name=XXX 会进过Feign的负载均衡
 */
@RestController
public class FeignHelloController {

    @Autowired
    private SchedualServiceHello serviceHello;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name){
        return serviceHello.hellloFromFeign(name);
    }
}
