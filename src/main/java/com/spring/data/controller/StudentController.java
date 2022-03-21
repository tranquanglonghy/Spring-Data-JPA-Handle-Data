package com.spring.data.controller;

import com.spring.data.entity.StudentEntity;
import com.spring.data.repository.StudentRepository;
import com.spring.data.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentRepository repo;

    @Value("${app.name}")
    private String name;

    @Value("${app.name2: default name}")
    private String name2;

    @GetMapping("/student_1")
    public String getStudent1 (){
        return name;
    }

    @GetMapping("/student_2")
    public String getStudent2 (){
        return name2;
    }

    @GetMapping("/student_3")
    public String getStudent3 (){
        StudentResponse str = new StudentResponse((long)1, "john", "smith");
        return str.toString();
    }

    @GetMapping("/response")
    public StudentResponse getResponse(){
        StudentEntity entity = new StudentEntity(1, "Vladimir", "Putin", "Putin@russia");
        repo.save(entity);

        StudentResponse str = new StudentResponse((long)1, "john", "smith");
        return str;
    }

}
