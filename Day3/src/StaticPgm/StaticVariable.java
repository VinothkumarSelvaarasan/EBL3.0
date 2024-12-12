package StaticPgm;
public class StaticVariable {
	int counter=0;
	static int staticCounter=0;
	void increment()
	{
		counter++;
		staticCounter++;
	}
	void printData()
	{
		System.out.println("Counter Value is "+counter);
		System.out.println("Static Counter is "+staticCounter);	
	}
	public static void main(String[] args) {
		StaticVariable sv=new StaticVariable();
		StaticVariable sv1=new StaticVariable();
		sv.increment();
		sv.increment();
		sv.printData();
		sv1.increment();
		sv1.printData();
	}

}
