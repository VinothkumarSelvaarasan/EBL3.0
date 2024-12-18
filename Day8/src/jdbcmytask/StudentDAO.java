package com.wecp.dao;


import com.wecp.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface StudentDAO {
    void createStudent(Student student) throws SQLException;
    Student getStudentById(int id) throws SQLException;
    List<Student> getAllStudents() throws SQLException;
    void updateStudent(Student student) throws SQLException;
    void deleteStudent(int id) throws SQLException;
}
