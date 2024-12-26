package com.iisn.loosely;

import java.util.Scanner;

public class StaffClass implements  College {
	Scanner s=new Scanner(System.in);
	int StaffId;
	String name;

	@Override
	public void getDetails() {
		System.out.println("Enter the StaffId");
		StaffId=s.nextInt();
		System.out.println("Enter the Name");
		name =s.next();

		
	}

	@Override
	public void printDetails() {
		System.out.println("Staff Id is "+StaffId);
		System.out.println("Name is "+name);
		
	}

}
