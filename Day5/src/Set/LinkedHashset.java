package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * LinkedHashset in maintain the insertion order.
 * LinkedHashset doesn't accept the duplicate value
 * 
 */
public class LinkedHashset {

	void addData()
	{
		Set<String> s1=new LinkedHashSet<String>();
		s1.add("Mumbai");
		s1.add("Chennai");
		s1.add("Bangalore");
		s1.add("Andra");
		s1.add("Kerala");
		s1.add("Kerala");
		//s1.remove("Kerala");
		s1.remove(0);
		Iterator<String> s=s1.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		
		
	}
	public static void main(String[] args) {
		LinkedHashset hsp=new LinkedHashset();
		hsp.addData();
	}
}
