package HashMapPgm;

import java.util.*;  

class LinkedHashMap1{  

 public static void main(String args[]){
  LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();  
  h.put(18172,"Ankit"); 
  h.put(18121,"Priya");  

  h.put(18212,"Ganesh");  

  

for(Map.Entry m:h.entrySet()){  

   System.out.println(m.getKey()+" "+m.getValue()); 

  }  

 }  

} 