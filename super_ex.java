package java_example;

class super_ex {
	String fruit = "apple";
}

class abc extends super_ex {
	String fruit = "orange";

	void dis() {
		System.out.println(super.fruit);
		
	}
}

class TestSuper1 {
	public static void main(String args[]) {
		abc d = new abc();
		d.dis();
	}
}
