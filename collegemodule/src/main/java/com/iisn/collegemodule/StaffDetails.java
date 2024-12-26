package com.iisn.collegemodule;

import java.util.Scanner;

public class StaffDetails implements CollegeClass{
	int employeeId;
	String staffName;
	Scanner S=new Scanner(System.in);
	
	@Override
	public void getData() {
		System.out.println("Enter the Employee Id");
		employeeId=S.nextInt();
		System.out.println("Enter the Staff Name");
		staffName=S.next();
	}

	@Override
	public void printData() {
		System.out.println("Empoyee Id is "+employeeId);
		System.out.println("Staff Name is "+staffName);
		
	}

}
