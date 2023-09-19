package java_example;

public class cons_ex {
 
  cons_ex(int i){
	 System.out.println(i);
 }
  
  cons_ex(String i){
		 System.out.println(i);
	 }
	void dis()
	{
		System.out.println("i am method");
	}
	public static void main (String args[]){
		
		cons_ex obj = new cons_ex("hi");
		
		
	}
	
}
