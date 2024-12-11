package ConditionalStatement;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		System.out.println("Vote Eligibility Checker");
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Age");
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible");
		}
		System.out.println("You are not Eligible");
		
	}

}
