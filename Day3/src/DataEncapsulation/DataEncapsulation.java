package DataEncapsulation;

import java.util.Scanner;

public class DataEncapsulation {
	
	Registeration registeration=new Registeration();
	Scanner s1=new Scanner(System.in);
	
	void getData()
	{
		System.out.println("Enter the Register Number");
		registeration.setRegisterNumber(s1.nextInt());
		System.out.println("Enter the Student Name ");
		registeration.setStudentName(s1.next());
		System.out.println("Enter the Mobile Number ");
		registeration.setMobileNo(s1.nextLong());
		System.out.println("Enter the Salary ");
		registeration.setEmployeeSalary(s1.nextInt());
	}
	void printData()
	{
		System.out.println("Register Number "+registeration.getRegisterNumber());
		System.out.println("Studetn name is "+registeration.getStudentName());
		System.out.println("Mobile Number is "+registeration.getMobileNo());
		System.out.println("Salary is "+registeration.getEmployeeSalary());
	}
	public static void main(String[] args) {
		DataEncapsulation de=new DataEncapsulation();
		de.getData();
		de.printData();
	}

}
