package com.wecp;

import com.wecp.dao.StudentDAO;
import com.wecp.dao.StudentDAOImpl;
import com.wecp.entity.Student;
import com.wecp.service.StudentService;
import com.wecp.service.StudentServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB_wecp",
         "root", "hellowecp")) {
            StudentDAO studentDAO = new StudentDAOImpl(connection);
            StudentService studentService = new StudentServiceImpl(studentDAO);
            Scanner scanner = new Scanner(System.in);

            // Example of adding a student
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter student grade: ");
            String grade = scanner.nextLine();
            System.out.println("Enter student department: ");
            String department = scanner.nextLine();

            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setGrade(grade);
            student.setDepartment(department);

            studentService.addStudent(student);
            System.out.println("Student added successfully!");

            // Fetch all students
            List<Student> students = studentService.getAllStudents();
            System.out.println("All Students:");
            for (Student s : students) {
                System.out.println(s.getId() + ": " + s.getName() + ", Age: " + s.getAge() + ", Grade: " + s.getGrade() + ", Department: " + s.getDepartment());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
