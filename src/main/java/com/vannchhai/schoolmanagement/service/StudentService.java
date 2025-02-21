package com.vannchhai.schoolmanagement.service;

import com.vannchhai.schoolmanagement.model.Student;
import com.vannchhai.schoolmanagement.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

