package CustomizedException;

import java.util.Scanner;

public class Shopping {
	Scanner S=new Scanner(System.in);
	
	String product;
	int Quantity;
	void purchase() throws QuantityCheckerException
	{
		System.out.println("Enter the Product you Want Purchase");
		product=S.next();
		System.out.println("Enter the Quantity");
		Quantity=S.nextInt();
		if(Quantity>=5)
		{
			throw new QuantityCheckerException("Only 5 Product Allowed Per user");	
		}
		else
		{
			System.out.println("Happy Shopping");
		}
		
	}
	public static void main(String[] args)  {
		Shopping s=new Shopping();
		try
		{
			s.purchase();	
		}
		catch(QuantityCheckerException qec)
		{
			System.out.println(qec);
		}
			
		
		
		
	
	}

}
