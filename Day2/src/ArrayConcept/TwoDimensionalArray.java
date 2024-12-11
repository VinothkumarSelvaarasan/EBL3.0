package ArrayConcept;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String wareHouse[][]=new String[3][3];
		System.out.println("Enter the Product you Want to Add into WareHouse");
		for(int i=0;i<wareHouse.length;i++)
		{
			for(int j=0;j<wareHouse[i].length;j++)
			{
				System.out.println("Enter the Product you want to Store on Room No "+(i+1)+(j+1));
				wareHouse[i][j]=s.next();
			}
		}
		
		System.out.println("Ware House Porduct ");
		for(int i=0;i<wareHouse.length;i++)
		{
			for(int j=0;j<wareHouse[i].length;j++)
			{
				System.out.println("Product on Room No "+(i+1)+(j+1)+ " is "+wareHouse[i][j]);
			}
		}
		
	}
	


}
