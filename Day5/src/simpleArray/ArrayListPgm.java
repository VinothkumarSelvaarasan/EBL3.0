package simpleArray;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPgm {
	ArrayList<String> sl=new ArrayList<String>();
	 void addRecord()
	{
		sl.add("George");
		sl.add("Vipul");
		sl.add("Adhitya");
		sl.add("Dileep");
	
	Iterator<String> itera=sl.iterator();
	while(itera.hasNext())
	{
		System.out.println(itera.next());
	}

}
	public static void main(String[] args) {
		ArrayListPgm alp=new ArrayListPgm();
		alp.addRecord();
	}
}
