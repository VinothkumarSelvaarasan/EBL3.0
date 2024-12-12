package SuperKeyword;

public class ChildClass extends ParentClass {
	String ChildName;
	String FatherName;
	String MotherName;
	ChildClass()
	{
		super();
		ChildName="Roshan Niranjan";
		FatherName="Vinothkumar Selvaarasan";
		MotherName="Chithra Vinothkumar";
	}
	ChildClass(String ChildName,String FatherName,String MotherName,int r,String n)
	{
		super (r,n);
		this.ChildName=ChildName;
		this.FatherName=FatherName;
		this.MotherName=MotherName;
	}
	void printdata()
	{
		super.printdata();
		System.out.println("Child Name "+ChildName);
		System.out.println("Father Name "+FatherName);
		System.out.println("Mother Name "+MotherName);
	}
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.printdata();
		ChildClass cc1=new ChildClass("Ashok","Selva","Lakshmi",667,"School");
		cc.printdata();
	}

}
