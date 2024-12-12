package classPgm;

public class ThisKeyWord {
	int registerNo;
	String name;
	ThisKeyWord()
	{
		registerNo=666;
		name="Vinothkumar";
	}
	ThisKeyWord(int registerNo,String name)
	{
		this.registerNo=registerNo;
		this.name=name;
	}
	void printData()
	{
		System.out.println("Register No "+registerNo);
		System.out.println("Name is "+name );
	}
	public static void main(String[] args) {
		ThisKeyWord tkw=new ThisKeyWord();
		ThisKeyWord tkw1=new ThisKeyWord(878,"RoshanNiranjan");
		tkw.printData();
		tkw1.printData();
	}
	

}
