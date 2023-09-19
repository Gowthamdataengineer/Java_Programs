package test;

public class mthdoverloading {

	void addition() {
		int a=10;
		int b=20;
		int c =a+b;
		System.out.println("result  "+ c);
	}
	
	void addition(int a) {
		
		System.out.println("method 2  - "+ a);

	}
	
	void addition(String a) {
		System.out.println("result  "+ a);

	}
	
	void addition (String b, String c) {
		System.out.println("method string -  "+ b + c);

	}
	public static void main(String[] args) {

		mthdoverloading caller = new mthdoverloading();
		caller.addition("a","b");
		caller.addition();
		caller.addition("c");
		caller.addition(10);
	}

}
