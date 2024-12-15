package com.wecp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementApp {

    public static List<Employee> filterAndSortEmployees
    (List<Employee> employees, double salaryThreshold) {
        return employees.stream()
                .filter(employee -> employee.getSalary() >= salaryThreshold)
                .sorted((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 45000.0));
        employees.add(new Employee(2, "Jane Smith", 55000.0));
        employees.add(new Employee(3, "Mike Brown", 35000.0));
        employees.add(new Employee(4, "Anna White", 60000.0));
        employees.add(new Employee(5, "David Clark", 40000.0));
        double salaryThreshold = 40000.0;
        List<Employee> filteredAndSortedEmployees = filterAndSortEmployees(employees, salaryThreshold);
        filteredAndSortedEmployees.forEach(System.out::println);
    }
}
