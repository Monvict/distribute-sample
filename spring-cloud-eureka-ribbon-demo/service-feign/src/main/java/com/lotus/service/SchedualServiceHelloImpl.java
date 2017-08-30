package com.lotus.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/8/29.
 * 当发生错误时，供hystrix作回调处理
 */
@Component
public class SchedualServiceHelloImpl implements SchedualServiceHello {
    @Override
    public String hellloFromFeign(@RequestParam(value = "name") String name) {
        return "Soryy " + name + "An erroer happend in feign";
    }
}
