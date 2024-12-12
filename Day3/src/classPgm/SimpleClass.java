package classPgm;

import java.util.Scanner;

public class SimpleClass {
	int registerNumber;
	String name;
	Scanner s1=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Register Number");
		registerNumber=s1.nextInt();
		System.out.println("Enter the Name");
		name=s1.next();
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		SimpleClass simple=new SimpleClass();
		simple.getData();
		simple.printData();
	}

}
