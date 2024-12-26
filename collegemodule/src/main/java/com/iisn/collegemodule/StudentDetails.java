package com.iisn.collegemodule;

import java.util.Scanner;

public class StudentDetails implements CollegeClass {
	int registerNo;
	String studentName;
	String dept;
	Scanner S=new Scanner(System.in);
	
	@Override
	public void getData() {
		System.out.println("Enter the Registeration No");
		registerNo=S.nextInt();
		System.out.println("Enter the Student Name");
		studentName=S.next();
	}

	@Override
	public void printData() {
		System.out.println("Empoyee Id is "+registerNo);
		System.out.println("Staff Name is "+studentName);
		
	}
}
