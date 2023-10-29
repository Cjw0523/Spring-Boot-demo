package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    void insert(Student student);

    void batchInsert(List<Student> studentList);

    void deleteById(Integer studentId);

    Student getById(Integer studentId);
}
