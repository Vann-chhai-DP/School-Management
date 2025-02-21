package com.vannchhai.schoolmanagement.model;
import jakarta.persistence.*;


@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String birthday;
    private String newStudent;
    private String college;
    private String major;
    private String color;


    public Student() {}

    public Student(String email, String password, String birthday, String newStudent,
                   String college, String major, String color) {
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.newStudent = newStudent;
        this.college = college;
        this.major = major;
        this.color = color;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getNewStudent() {
        return newStudent;
    }
    public void setNewStudent(String newStudent) {
        this.newStudent = newStudent;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
