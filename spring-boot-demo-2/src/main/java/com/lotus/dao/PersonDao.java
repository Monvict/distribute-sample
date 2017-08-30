package com.lotus.dao;

import com.lotus.bean.Person;

/**
 * Created by Administrator on 2017/8/23.
 */
public class PersonDao {

    public PersonDao() {
        System.out.println("PersonDao 被实例化了....");
    }

    public Person getPerson() {
        return new Person("Tony", "ShenZhen");
    }
}
