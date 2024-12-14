package EntityArrayList;

import java.util.ArrayList;

public class ArrayListImpl {
	ArrayList<Registeration> al=new ArrayList<Registeration>();
	void addData()
	{
		Registeration r1=new Registeration(1, "Aadhitya", "CSE");
		Registeration r2=new Registeration(2, "Aswan", "CSE");
		Registeration r3=new Registeration(3,"Narasima","CSE");
		al.add(r1);
		al.add(r2);
		al.add(r3);
		for(Registeration r:al)
		{
			System.out.println("Registeration Number "+r.getRegisterNo());
			System.out.println("Registeration Number "+r.getName());
			System.out.println("Registeration Number "+r.getDept());
			System.out.println("**********Next Record*******");
		}
		
	}
	public static void main(String[] args) {
		ArrayListImpl ali=new ArrayListImpl();
		ali.addData();
	}
			

}
