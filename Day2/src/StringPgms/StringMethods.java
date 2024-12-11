package StringPgms;

public class StringMethods {
public static void main(String[] args) {
	String sVar="LnTEdutech";    
	System.out.println(sVar.toUpperCase());   
	System.out.println(sVar.toLowerCase());   
	System.out.println(sVar);
	
	//Trim Method
	String sTrim="  LnTEdutech  ";    
	System.out.println(sTrim);    
	System.out.println(sTrim.trim()); 
	
	//startsWith and endsWith 
	
	 String s="LnTEdutech";    
	 System.out.println(s.startsWith("Ln"));  
	 System.out.println(s.endsWith("n"));
	 
	 //CharAt
	 String s="LnTEdutech";    
	 System.out.println(s.charAt(0));//L   
	 System.out.println(s.charAt(3));//E   
	 
	 //Length
	 String str3="LnTEdutech";    
	 System.out.println(s.length());   //10 
	 
	 //intern
	 String str1=new String("LnTEdutech");    
	 String str2=str1.intern();    
	 System.out.println(str2);//LnTEdutech
	 
	 //ValueOf
	 int a=66;    
	 String str=String.valueOf(a);    
	 System.out.println(str+66);  //6666
	 
	 //Replace Method
	 String s1="As L&T Construction, the construction arm of L&T, we are India's largest construction organization and ranked among the world's top contractors.";      
	 String replaceString=s1.replace("top","First");      
	 System.out.println(replaceString);    
	
}
}
