package classPgm;

public class ConstructorOverLoading {
	int registerNo;
	String name;
	ConstructorOverLoading()
	{
		registerNo=666;
		name="Vinoth";
	}
	ConstructorOverLoading(int r,String n)
	{
		registerNo=r;
		name=n;
	}
	void printData()
	{
		System.out.println("Register Number "+registerNo);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ConstructorOverLoading cl=new ConstructorOverLoading();
		ConstructorOverLoading cl1=new ConstructorOverLoading(667,"Ashok");
		cl.printData();
		cl1.printData();
	
	}

}
