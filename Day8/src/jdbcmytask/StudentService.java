package com.wecp.service;

import com.wecp.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student) throws Exception;

    Student getStudent(int id) throws Exception;

    void updateStudent(Student student) throws Exception;

    void deleteStudent(int id) throws Exception;

    List<Student> getAllStudents() throws Exception;
}
