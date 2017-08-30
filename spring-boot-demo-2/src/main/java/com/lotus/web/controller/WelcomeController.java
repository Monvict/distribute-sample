package com.lotus.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Administrator on 2017/8/23.
 */
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(ModelMap map) {
        map.put("message", "Hello Thymeleaf! It's very happy to meet you");
        return "welcome";
    }
}
