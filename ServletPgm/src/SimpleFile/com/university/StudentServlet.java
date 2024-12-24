package com.university;



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", "S123", "john.doe@example.com"));
        studentList.add(new Student("Jane", "Smith", "S124", "jane.smith@example.com"));
        studentList.add(new Student("Michael", "Johnson", "S125", "michael.johnson@example.com"));
        request.setAttribute("studentList", studentList);
        request.getRequestDispatcher("students.jsp").forward(request, response);
    }
}

