package AbstractClassPgm;


abstract class parentClass
{
	parentClass()
	{
		System.out.println("I am a Abstract Class constructor");
	}
	abstract void getInfo();
	void printInfo()
	{
		System.out.println("Print Abstract class Method");
	}
}

public class AbstractPgm extends parentClass{

	AbstractPgm()
	{
		System.out.println("I am Sub Class Constructor");
	}
	@Override
	void getInfo() {
		System.out.println("I am abstract method implement in the sub class");
		
	}
//	@Override
//	void printInfo() {
//		System.out.println("I am Sub class Method");
//	}
	public static void main(String[] args) {
	parentClass pc=new AbstractPgm();
	AbstractPgm ap=new AbstractPgm();
	pc.printInfo();
	ap.getInfo();
//		//ap.printInfo();
	}
	
}
