package java_example;
import java.util.*;  

public class list_ex {

	 public static void main(String args[]){  
		  
		  LinkedList<String> ls=new LinkedList<String>();  
		  ls.add("gowtham");  
		  ls.add("nandhu");  
		  ls.add("nila");  
		  ls.add("saravana");  
		  System.out.println(ls);  
		  Iterator<String> itr=ls.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  ls.add(1, "Ram");  
		  System.out.println(ls);  
		  
		  ls.remove(3);  
		  System.out.println(ls);  
		  
		  
		 }  
}
