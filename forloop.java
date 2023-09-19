package test;

public class forloop {
	public static void main(String[] args) {
		// Outer loop
		for (int i = 1; i <= 2; i++) {
		  System.out.println("Outer: " + i); // 2 times
		  
		  // Inner loop
		  for (int j = 1; j <= 3; j++) {
		    System.out.println(" Inner: " + j); // 2*3 6 times 
		  }
		} 
	}
}
