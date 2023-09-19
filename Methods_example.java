package test;

public class Methods_example {
	// this method is used for adding 2 numbers
	void addition() {
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Result -" + c);	
	}
	
	void sub(int a,int b) {
		int c=a-b;
		System.out.println("Result -" + c);	
	}
	
	void str(String a, String b, String c) {
		System.out.println("Result -" + a+b+c);	
		
	}
	
	int add(int a,int b) {
		int c=a+b;
		
		return c;
	}
	
	
public static void main(String [] args) {
	Methods_example caller = new Methods_example();
	caller.addition();
	caller.sub(20,10);
	caller.str("x", "y", "z");
	int d=caller.add(10, 40);
	System.out.println("Result -" + d);
		
}
}
