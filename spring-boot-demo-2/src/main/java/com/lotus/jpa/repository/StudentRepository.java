package com.lotus.jpa.repository;

import com.lotus.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findByName(String name);

    Student findByNameAndAddress(String name, String address);

    @Modifying
    @Transactional
    @Query("update Student S set S.age = ?2 where S.name = ?1")
    void updateByName(String name, int age);

    @Modifying
    @Transactional
    @Query("delete from Student s where s.name = ?1")
    void deleteByName(String name);
}
