package Set;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

/*
 * Treeset don't accept the duplicate values.
 * It maintain the data in ascending order.
 * It don't aceept the null values.
 * Its faster
 */
public class TreeSetPgm {
	void addData()
	{
		Set<String> s1=new TreeSet<String>();
		s1.add("Mumbai");
		s1.add("Chennai");
		s1.add("Bangalore");
		s1.add("Andra");
		s1.add("Kerala");
		s1.add("Kerala");
		//s1.remove("Kerala");
		//s1.remove(0);
		Iterator<String> s=s1.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		
		
	}
	public static void main(String[] args) {
		TreeSetPgm hsp=new TreeSetPgm();
		hsp.addData();
	}


}
