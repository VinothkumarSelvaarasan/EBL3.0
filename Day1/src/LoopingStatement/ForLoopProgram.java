package LoopingStatement;

import java.util.Scanner;

public class ForLoopProgram {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
			System.out.println(calculateFact(num));
	}
	
	public static int calculateFact(int fact)
	{
		
		if(fact==1)
		{
			return 1;
		}
		else
		{
			int ans=1;
			for (int i=1;i<=fact;i++)
			{
				ans=ans*i;
			}
			return ans;
		}
		
	}

}
