package ArrayConcept;

import java.util.Scanner;

public class DynamicSizeArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []marks;
		int size;
		System.out.println("Enter the Array Size");
		size=s.nextInt();
		marks=new int[size];
		System.out.println("Enter the Marks for "+size+" Subjects");
		for (int i=0;i<marks.length;i++)
		{
			marks[i]=s.nextInt();
		}
		
		System.out.println("Score you Secured ");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks of Subject "+(i+1)+ " is "+marks[i]);
		}
		
		
	}

}
