package ConditionalStatement;

import java.util.Scanner;

public class IfElseIfCondition {
	public static void main(String[] args) {
		System.out.println("Grade Calculate System");
		Scanner s=new Scanner(System.in);
		int percentage;
		System.out.println("Enter the Percentage ");
		percentage=s.nextInt();
		if(90 <= percentage  &&     100>= percentage)
		{
			System.out.println("S Grade");
		}
		else if(80 <= percentage  &&     89>= percentage)
		{
			System.out.println("A Grade");
		}
		else if(70 <= percentage  &&     79>= percentage)
		{
			System.out.println("B Grade");
		}
		else if(60 <= percentage  &&     69>= percentage)
		{
			System.out.println("C Grade");
		}
		else if(50 <= percentage  &&     59>= percentage)
		{
			System.out.println("D Grade");
		}
		else if(40 <= percentage  &&     49>= percentage)
		{
			System.out.println("E Grade");
		}
		else if(0 <= percentage  &&     39>= percentage)
		{
			System.out.println("F Grade");
		}
		else
		{
			System.out.println("Enter the value between 0 to 100");
		}
		
	}

}
