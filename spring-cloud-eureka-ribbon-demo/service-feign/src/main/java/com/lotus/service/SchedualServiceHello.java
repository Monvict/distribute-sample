package com.lotus.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/8/29.
 */
@FeignClient(value = "service-hello", fallback = SchedualServiceHelloImpl.class)
// 在Eureka中寻找service-hello的服务
// fallback 用来处理当发生错误时，hystrix要回调的方法
public interface SchedualServiceHello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hellloFromFeign(@RequestParam(value = "name") String name);
}
