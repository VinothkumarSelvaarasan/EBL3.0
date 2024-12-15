package ComparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPgmComparable {
	ArrayList<String>  sl=new ArrayList<String>();
	void add1()
	{
		sl.add("George");
		sl.add("Vipul");
		sl.add("Adhitya");
		sl.add("Dileep");
		Collections.sort(sl);
		for(String str:sl)
		{
			System.out.println(str+"\n");
		}
		
	}
	public static void main(String[] args) {
		ArrayListPgmComparable alpc=new ArrayListPgmComparable();
		alpc.add1();
	}
	

}
