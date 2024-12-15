package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Hash set donesn't maintain the insertion order.
 * Hashset don't accept duplicate value.
 * Hashset it allow null values.
 * 
 */
public class HashsetPgm {
	void addData()
	{
		Set<String> s1=new HashSet<String>();
		s1.add("Mumbai");
		s1.add("Mumbai");
		s1.add("Chennai");
		s1.add("Bangalore");
		s1.add("Andra");
		s1.add("Andra");
		s1.add("Kerala");
		s1.add("Chennai");
		Iterator<String> s=s1.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
		
		
	}
	public static void main(String[] args) {
		HashsetPgm hsp=new HashsetPgm();
		hsp.addData();
	}

}
