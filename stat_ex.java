package java_example;

public class stat_ex {
	String name ;
	static String college;
		
	public void display(){
		System.out.println(name);
		System.out.println(college);
	}
	static void clg_name(){
		college = "AABBCCDDEE";
	}
	
	static{
		System.out.println("I am static block");
	}
}
 class demo {
	
	 public static void main (String args[]) {
		 
		 stat_ex gowtham = new stat_ex();
		 gowtham.name="gowtham";
		 stat_ex.college="AABBCC";
		 
		 stat_ex nandhu = new stat_ex();
		 nandhu.name ="nandhu";
		 stat_ex.college="AABBCCDD";
		 
		 stat_ex.clg_name();
		 nandhu.display();
		 gowtham.display();
		 
	 }
}