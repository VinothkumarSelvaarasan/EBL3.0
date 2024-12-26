package com.iisn.loosely;

import java.util.Scanner;

public class StudentClass implements College{
	int StudentId;
	String dept;
	Scanner s=new Scanner(System.in);

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Student Id");
		StudentId=s.nextInt();
		System.out.println("Enter the Dept");
		dept=s.next();
		
		
	}

	@Override
	public void printDetails() {
		System.out.println("Student Id "+StudentId);
		System.out.println("Department "+dept);
		
	}

}
