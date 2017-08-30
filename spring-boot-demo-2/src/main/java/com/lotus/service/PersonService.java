package com.lotus.service;

import com.lotus.bean.Person;
import com.lotus.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/23.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao dao;

    public PersonService() {
        System.out.println("Person Service 被实例化了.......");
    }

    public Person getPerson() {
        return dao.getPerson();
    }
}
