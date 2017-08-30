package com.lotus.service;

import com.lotus.UserService;

/**
 * Created by Administrator on 2017/8/30.
 */
public class UserServiceImpl implements UserService {

    public void registe(String username, String password) {
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("接收到注册用户请求 - {username:%s, password:%s}",
                username, password));
        System.out.println("---------------------------------------------------------");
    }

}
