package java_example;

public class exec {

	
	public static void main (String args[]){

		try {
		int a =10/0;
		System.out.println(a);
		}
		catch(Exception e){
			System.out.println(e);
		}
		 finally {  
			 System.out.println("finally block is always executed");  
			 }    
		System.out.println("Rest the code");

	}
	
}
