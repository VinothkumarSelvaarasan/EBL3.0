package ArrayConcept;

import java.util.Scanner;

public class SimpleArray {
	public static void main(String[] args) {
		int marks[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Values for Five Subjects");
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
