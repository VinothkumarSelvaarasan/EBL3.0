package SingleInheritance;

import java.util.Scanner;

class OwnerClass
{
	String ownerName;
	String registerNo;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Owner Name");
		ownerName=s.next();
		System.out.println("Enter the Register Number ");
		registerNo=s.next();
	}
	void printData()
	{
		System.out.println("Owner Name is "+ownerName);
		System.out.println("Register Number is "+registerNo);
		
	}
	
}

class CarDetails extends OwnerClass
{
	String manuFacturer;
	String carModel;
	void getCarDetails()
	{
		System.out.println("Enter the Manufacturer name");
		manuFacturer=s.next();
		System.out.println("Enter the Car Model ");
		carModel=s.next();
	}
	void printCarDetails()
	{
		System.out.println("Manufacturer Name is "+manuFacturer);
		System.out.println("Car Model is "+carModel);
	}
}

public class CarInfo {
public static void main(String[] args) {
	CarDetails cd=new CarDetails();
	cd.getData();
	cd.getCarDetails();
	cd.printData();
	cd.printCarDetails();
}
}
