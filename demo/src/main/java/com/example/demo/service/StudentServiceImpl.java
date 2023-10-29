package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public void insert(Student student){
        studentDao.insert(student);
    }

    @Override
    public void batchInsert(List<Student> studentList){
        studentDao.batchInsert(studentList);
    }

    @Override
    public void deleteById(Integer studentId) {
        studentDao.deleteById(studentId);
    }

    @Override
    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }
}
