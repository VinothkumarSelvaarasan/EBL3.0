package simpleexception;

import java.util.Scanner;

public class ThrowKeyWordExample {
	void check()
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the A value ");
		a=s.nextInt();
		System.out.println("Enter the B value ");
		b=s.nextInt();
		if(b==0)
		{
			throw new IllegalArgumentException("B vaue Should Be Greater than Zero");
		}
		else
		{
			c=a/b;
			System.out.println("The Division of a/b is "+c);
		}
		System.out.println("Good Day to go");
		
	}
	public static void main(String[] args) {
		ThrowKeyWordExample tkwe=new ThrowKeyWordExample();
		try
		{
			tkwe.check();
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println(iae);
		}
	
	}

}
