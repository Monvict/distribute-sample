package com.lotus.web.controller;

import com.lotus.bean.Person;
import com.lotus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/23.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    public PersonController() {
        System.out.println("PersonController 被实例化了....");
    }

    @RequestMapping("/person")
    public Person getPeron() {
        return service.getPerson();
    }
}
