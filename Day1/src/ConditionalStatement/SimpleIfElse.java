package ConditionalStatement;

import java.util.Scanner;

public class SimpleIfElse {
	public static void main(String[] args) {
		System.out.println("Voter Eligibility Checker");
		Scanner s=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=s.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligibile");
		}
		else
		{
			System.out.println("You are Not Eligibile");
		}
	}

}
