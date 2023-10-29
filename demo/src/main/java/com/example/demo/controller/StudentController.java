package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String insert(@RequestBody Student student) {

        studentService.insert(student);

        return "執行 INSERT sql";
    }

    @PostMapping("/students/batch")
    public String insertList(@RequestBody List<Student> studentList) {

        studentService.batchInsert(studentList);

        return "執行一批 INSERT sql";

    }

    @DeleteMapping("/students/{studentsId}")
    public String delete(@PathVariable Integer studentsId) {

        studentService.deleteById(studentsId);

        return "執行 DELETE  sql";
    }

    @GetMapping("/student/{studentId}")
    public Student select(@PathVariable Integer studentId){
        return studentService.getById(studentId);
    }

}
