package StaticPgm;

public class StaticMethod {
	
	int registerNo=100;
	static String name="Vinoth";
	static void printData()
	{
		System.out.println("Name is "+name);
	}
	 void printData1()
	{
			System.out.println("Register Number is "+registerNo);
	}
	 public static void main(String[] args) {
		 StaticMethod sm=new StaticMethod();
		 sm.printData1();
		 StaticMethod.printData(); //Call Static Method
		// printData(); //Another way of Call Static Method
	}

}
