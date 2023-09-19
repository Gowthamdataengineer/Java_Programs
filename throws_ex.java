package java_example;

import java.io.IOException;

class throws_ex {
	void m() throws IOException {
		throw new IOException("device error");
	}


	void p() {
		try {
			m();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		throws_ex obj = new throws_ex();
		obj.p();
		System.out.println("normal flow...");
	}
}
