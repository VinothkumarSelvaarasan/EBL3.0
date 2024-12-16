package HashMapPgm;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashCodeGenerator {
	void add()
	{
		HashMap<String,String> hashMap=new HashMap<String,String>();
		hashMap.put("name","Vinothkumar Selvaarasan");
		hashMap.put("registerano","8383SNS");
		hashMap.put("dept", "Computer Science");
		for(Map.Entry<String, String> me:hashMap.entrySet())
		{
			System.out.print(me.getKey().hashCode()+" -> ");
			System.out.print((me.getKey().hashCode() %10));
			System.out.print(" -> Key "+me.getKey()+ " -> Value is "+me.getValue()+" \n");
		}
		
		
	}
	public static void main(String[] args) {
		SimpleHashCodeGenerator shm=new SimpleHashCodeGenerator();
		shm.add();
	}

}
