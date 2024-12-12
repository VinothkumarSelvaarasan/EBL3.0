package StaticPgm;

public class StaticBlock {
	static
	{
		System.out.println("I am Static Block 1");
	}
	
	StaticBlock()
	{
		System.out.println("I am a Constructor");
	}
	
	static
	{
		System.out.println("I am Static Block 2");
	}
	
	static
	{
		System.out.println("I am Static Block 3");
	}
	public static void main(String[] args) {
		new StaticBlock();
	}
	
}
