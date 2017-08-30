package com.lotus.web.controller;

import com.lotus.bean.Student;
import com.lotus.jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @RequestMapping("/regist")
    public Student doRegist(String name,String address,Integer age){
        Student student = repository.save(new Student(name,age,address));
        return student;
    }

    @RequestMapping("/find")
    public Student queryByName(String name) {
        Student student = repository.findByName(name);
        return student;
    }

    @RequestMapping("/findna")
    public Student queryByNameAndAddr(String name, String address) {
        Student student = repository.findByNameAndAddress(name, address);
        return student;
    }

    @RequestMapping("/findall")
    public List<Student> queryAll() {
        List<Student> students = repository.findAll();
        return students;
    }

    @RequestMapping("/findalls")
    public List<Student> queryAllSort(){

        Sort sort = new Sort(Sort.Direction.DESC, "age").and(new Sort(Sort.Direction.DESC,"name"));

        List<Student> students = repository.findAll(sort);

        return students;
    }

    @RequestMapping("/findallp")
    public List<Student> queryWithPage(int page, int size) {

        PageRequest pageRequest = new PageRequest(page, size);

        Page<Student> students = repository.findAll(pageRequest);

        List<Student> list = new ArrayList<Student>();

        for (Student student : students) {
            list.add(student);
        }

        return list;
    }

    @RequestMapping("/findallps")
    public List<Student> queryWithSortAndPage(int page, int size, String sortBy){
        Sort sort = new Sort(Sort.Direction.DESC, sortBy);

        PageRequest pageRequest = new PageRequest(page, size, sort);

        Page<Student> students = repository.findAll(pageRequest);

        List<Student> list = new ArrayList<Student>();

        for (Student student : students) {
            list.add(student);
        }

        return list;
    }

    @RequestMapping("/updateByName")
    public void updateByName(String name, int age){
        repository.updateByName(name, age);
    }

    @RequestMapping("/deleteByName")
    public void deleteByName(String name){
        repository.deleteByName(name);
    }
}
