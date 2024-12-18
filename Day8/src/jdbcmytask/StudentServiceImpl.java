package com.wecp.service;


import com.wecp.dao.StudentDAO;
import com.wecp.entity.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void addStudent(Student student) throws SQLException {
        validateStudent(student);
        studentDAO.createStudent(student);
    }

    @Override
    public Student getStudent(int id) throws SQLException {
        return studentDAO.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudents() throws SQLException {
        return studentDAO.getAllStudents();
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
        validateStudent(student);
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) throws SQLException {
        studentDAO.deleteStudent(id);
    }

    private void validateStudent(Student student) {
        if (student.getAge() < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        // Add more validation rules as needed
    }
}
