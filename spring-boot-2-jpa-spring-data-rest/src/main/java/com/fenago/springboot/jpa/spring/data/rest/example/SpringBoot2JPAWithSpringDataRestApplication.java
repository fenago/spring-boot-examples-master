package com.fenago.springboot.jpa.spring.data.rest.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fenago.springboot.jpa.spring.data.rest.example.student.StudentDataRestRepository;

@SpringBootApplication
public class SpringBoot2JPAWithSpringDataRestApplication {

    @Autowired
    StudentDataRestRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2JPAWithSpringDataRestApplication.class, args);
    }
}
