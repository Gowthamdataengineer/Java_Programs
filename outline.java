package java_example;

abstract class outline {
 
	abstract void add();
	abstract void sub();
	abstract void multi();
	void test(){
		
	}
	
}
class child extends outline{
	
	void add(){
		System.out.println("add");
	}
	void sub(){
		System.out.println("sub");
	}
	void multi(){
		System.out.println("multi");
	}
	void test(){
		System.out.println("test1");
	}
public static void main (String args[]){
	child obj = new child();
	obj.add();
	obj.sub();
	obj.multi();
	obj.test();
}
}