package test;

import java.util.Scanner;

public class get_val_runtime {

	public static void main(String[] args) {
		
		 int a;
		int b;
		int c;
		// Create a Scanner object to read input.
		Scanner console = new Scanner(System.in);

		// Get length from the user.
		System.out.print("Enter value for a ");
		a = console.nextInt();

		// Get width from the user.
		System.out.print("Enter value for b ");
		b = console.nextInt();

		// Calculate .
		c = a + b;

		// Display area.
		System.out.println("Total" + c);
	}
}
