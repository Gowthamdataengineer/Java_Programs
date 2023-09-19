package java_example;

public class this_ex {
	String name="nandhu";

	this_ex( String r) {
		name = r;
	}

	void display() {
		System.out.println(name);
	}
}

class TestClass {
	public static void main(String args[]) {
		this_ex s1 = new this_ex("gowtham");
		s1.display();
	}
}