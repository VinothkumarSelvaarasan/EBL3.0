package ConditionalStatement;

import java.util.Scanner;

public class SwitchCasePgm {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		System.out.println("1.Fibbonic\n2.Factorial\n3.Sum Calculator");
		Scanner s=new Scanner(System.in);
		int choice;
		char gender;
		gender=s.next().charAt(0);
		choice=s.nextInt();
		switch(choice)
		{
		
		case 1:
			System.out.println("Fibbonic Series Calculator");
			break;
		case 2:
			System.out.println("Factorial Calculator");
			break;
		case 3:
			System.out.println("Sum Calculator");
			break;
		default:
			System.out.println("Enter the Values in the Range 1 to 3");
			break;
			
			
		}
		
	}
	
//	public static int FactorialCalcualtor(int num)
//	{
//		if(num <=1)
//			return 1;
//		else
//		{
//			
//		}
//		
//	}

}
