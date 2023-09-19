package java_example;

public interface I1 {
  void add(int a);
  void sub();
  void multi();
  void test();
}
interface I2{
	void div();
	void mod();
}

class child1 implements I1 ,I2 {
	public void add(int a){
		System.out.println("add");
	}
	public void sub(){
		System.out.println("sub");
	}
	public void multi(){
		System.out.println("multi");
	}
	public void test(){
		System.out.println("test");
	}
	public void div(){
		System.out.println("add");
	}
	public void mod(){
		System.out.println("add");
	}
public static void main (String args[]){
	child1 obj = new child1();
	obj.add(10);
	obj.sub();
	obj.multi();
	obj.test();
}
}
