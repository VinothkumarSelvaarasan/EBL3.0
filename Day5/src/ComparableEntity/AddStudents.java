package ComparableEntity;

import java.util.ArrayList;
import java.util.Collections;



public class AddStudents {
	void addStudent()
	{
		ArrayList<Registeration> regi=new ArrayList<Registeration>();
		
		Registeration r1=new Registeration(8, "Santhosh", "Mech","Mumbai");
		Registeration r2=new Registeration(6, "Aswan", "Electrical","Mahape");
		Registeration r3=new Registeration(7,"Zebra","AI","Mumbai");
		regi.add(r1);
		regi.add(r2);
		regi.add(r3);
	
		//Collections.sort(regi,new NameComparator());
		Collections.sort(regi,new DepartmentComparator());
		for(Registeration r:regi)
		{
			System.out.println(r);
		}
		
	}
	public static void main(String[] args) {
		AddStudents as=new AddStudents();
		as.addStudent();
	}

}
