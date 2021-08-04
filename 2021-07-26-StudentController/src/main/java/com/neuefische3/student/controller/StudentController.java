package com.neuefische3.StudentController.controller;

import com.neuefische3.StudentController.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/studentList")
        public List<Student> getStudentList() {
            List<Student> studentList = new ArrayList<>();

            Student student1 = new Student("Peter");
            Student student2 = new Student("Andy");

            studentList.add(student1);
            studentList.add(student2);

        System.out.println(studentList);
            return studentList;
        }

}
