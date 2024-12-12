package SuperKeyword;

public class ParentClass {
	
	int RegisterNo;
	String Schoolname;
	ParentClass()
	{
		RegisterNo=666;
		Schoolname=" School";
	}
	ParentClass(int RegisterNo,String Schoolname)
	{
		this.RegisterNo=RegisterNo;
		this.Schoolname=Schoolname;
	}
	void printdata()
	{
		System.out.println("Register Number "+RegisterNo);
		System.out.println("School Name is "+Schoolname);
	}

}
