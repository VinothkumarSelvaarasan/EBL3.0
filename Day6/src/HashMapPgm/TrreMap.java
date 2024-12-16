package HashMapPgm;
import java.util.*;  
class TrreMap{  
 public static void main(String args[]){  
   TreeMap<Integer ,String> map=new TreeMap<Integer ,String>();    
	   map.put(18172,"Ankit"); 
	   map.put(18121,"Priya");  
	   map.put(18212,"Ganesh"); 
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  