package MethodsCreation;

import java.util.Scanner;

public class MethodWithArgReturnValue {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for A");
		a=s.nextInt();
		System.out.println("Enter the Value for B");
		b=s.nextInt();
		System.out.println("Addition of two Number is "+addValues(a,b));
		
	}
	public static int addValues(int x,int y)
	{
		return x+y;
	}

	
	
}
