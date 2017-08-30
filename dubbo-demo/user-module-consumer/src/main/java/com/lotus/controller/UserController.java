package com.lotus.controller;

import com.lotus.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/30.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/register")
    public String register(String username, String password) {
        if (!StringUtils.hasText(username) || !StringUtils.hasText(password)) {
            return "用户名或密码不能为空";
        }
        userService.registe(username, password);
        return "注册完成";
    }
}
