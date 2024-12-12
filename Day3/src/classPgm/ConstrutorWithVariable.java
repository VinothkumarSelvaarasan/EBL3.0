package classPgm;

public class ConstrutorWithVariable {
	int registerNo;
	String Name;
	ConstrutorWithVariable()
	{
		registerNo=666;
		Name="John Mc";
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+Name);
	}
	
	public static void main(String[] args) {
		ConstrutorWithVariable cwv=new ConstrutorWithVariable();
		cwv.printData();
	}

}
