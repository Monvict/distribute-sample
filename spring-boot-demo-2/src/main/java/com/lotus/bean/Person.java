package com.lotus.bean;

/**
 * Created by Administrator on 2017/8/23.
 */
public class Person {

    private String username ;

    private String address ;

    public Person(String username, String address) {
        this.username = username;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
