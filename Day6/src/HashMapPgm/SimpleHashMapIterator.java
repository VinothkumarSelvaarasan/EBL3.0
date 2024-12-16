package HashMapPgm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleHashMapIterator {
	void add()
	{
		HashMap<String,String> hashMap=new HashMap<String,String>();
		hashMap.put("name","Vinothkumar Selvaarasan");
		hashMap.put("registerano","8383SNS");
		hashMap.put("dept", "Computer Science");
		
		Iterator iterator= hashMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, String> me=(Entry<String, String>) iterator.next();
			System.out.println(me.getKey() + me.getValue());
			
		}
		
		
		
	}
	public static void main(String[] args) {
		SimpleHashMapIterator smi=new SimpleHashMapIterator();
		smi.add();
	}
}
