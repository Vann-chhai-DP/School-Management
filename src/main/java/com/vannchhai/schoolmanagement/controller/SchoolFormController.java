package com.vannchhai.schoolmanagement.controller;

import com.vannchhai.schoolmanagement.model.Student;
import com.vannchhai.schoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SchoolFormController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/schoolForm")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/submittedForm")
    public String processForm(@RequestParam String email,
                              @RequestParam String password,
                              @RequestParam String birthday,
                              @RequestParam String newStudent,
                              @RequestParam String college,
                              @RequestParam String major,
                              @RequestParam String color,
                              Model model) {

        Student student = new Student();
        student.setEmail(email);
        student.setPassword(password);
        student.setBirthday(birthday);
        student.setNewStudent(newStudent);
        student.setCollege(college);
        student.setMajor(major);
        student.setColor(color);

        studentService.saveStudent(student);

        model.addAttribute("student", student);
        return "submit";
    }
}
