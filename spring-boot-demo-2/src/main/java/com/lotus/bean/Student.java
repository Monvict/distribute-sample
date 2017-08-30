package com.lotus.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Administrator on 2017/8/24.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
