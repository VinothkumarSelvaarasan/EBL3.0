package simpleexception;

import java.util.Scanner;

public class SimpleTryCatch {
	void check()
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the A value ");
		a=s.nextInt();
		System.out.println("Enter the B value ");
		b=s.nextInt();
		try
		{
			c=a/b;
			System.out.println("The Division of a/b is "+c);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index Out Of Bound Exception "+ae);
		}
		catch(ArithmeticException ae1)
		{
			System.out.println("Arithematic Exception "+ae1);
		}
		catch(Exception e)
		
		{
		System.out.println("Main Exception "+e.getMessage());	
		}
		
		
		System.out.println("Good Day to go");
		
	}
	public static void main(String[] args) {
		SimpleTryCatch stc=new SimpleTryCatch();
		stc.check();
	}

}
