package HashMapPgm;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {
	void add()
	{
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(108927, "Dileep");
		hashMap.put(108274, "Aadhitya");
		hashMap.put(108278, "Debneet");
		hashMap.put(102838, "Ankit");
		hashMap.put(102832, "Vinoth");
		hashMap.put(102832, "Ansh");  //Duplicate Key is Not Accepted
		hashMap.put(102833, "Ansh");	//Duplicate Value is accepted
		hashMap.put(102838, " ");
		hashMap.put(102839, " "); //Hashmap accept any no of null values
		
		for(Map.Entry<Integer, String> me:hashMap.entrySet())
		{
			System.out.println("Key "+me.getKey()+" Value "+me.getValue());
		}
		
	}
	public static void main(String[] args) {
		SimpleHashMap shm=new SimpleHashMap();
		shm.add();
	}

}
