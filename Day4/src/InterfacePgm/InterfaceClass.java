package InterfacePgm;


interface staff
{
	public void getDetails();
	public void printData();
}

public class InterfaceClass implements staff {
	@Override
	public void getDetails() {
	
		System.out.println("Get Staff Details");
	}

	@Override
	public void printData() {
		System.out.println("Print Staff Details");
	
	}
	public static void main(String[] args) {
		InterfaceClass ic=new InterfaceClass();
		ic.getDetails();
		ic.printData();
	}

}
