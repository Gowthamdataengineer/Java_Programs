package test;

public class operatorsexample {

	public static void main(String[] args) {
		/*
		 * // declare variables int a = 12, b = 5;
		 * 
		 * // addition operator System.out.println("a + b = " + (a + b));
		 * 
		 * // subtraction operator System.out.println("a - b = " + (a - b));
		 * 
		 * // multiplication operator System.out.println("a * b = " + (a * b));
		 * 
		 * // division operator System.out.println("a / b = " + (a / b));
		 * 
		 * // modulo operator System.out.println("a % b = " + (a % b));
		 */
	    
	    // Assignment 
	    
		/*
		 * // create variables int a = 4; int var;
		 * 
		 * // assign value using = var = a; System.out.println("var using =: " + var);
		 * 
		 * // assign value using =+ var += a; //4 +=4 = 8+
		 * System.out.println("var using +=: " + var);
		 * 
		 * // assign value using =* var *= a; // 8 *=4 = 32*
		 * System.out.println("var using *=: " + var);
		 */
	    
	    
	    //Relational
		
		/*
		 * // create variables int a = 7, b = 11;
		 * 
		 * // value of a and b System.out.println("a is " + a + " and b is " + b);
		 * 
		 * // == operator System.out.println(a == b); // false
		 * 
		 * // != operator System.out.println(a != b); // true
		 * 
		 * // > operator System.out.println(a > b); // false
		 * 
		 * // < operator System.out.println(a < b); // true
		 * 
		 * // >= operator System.out.println(a >= b); // false
		 * 
		 * // <= operator System.out.println(a <= b); // true
		 */	  
		 
		/*
		 * //Logical
		 * 
		 * // && operator System.out.println((5 > 3) && (8 > 5)); // true
		 * System.out.println((5 > 3) && (8 < 5)); // false
		 * 
		 * // || operator System.out.println((5 < 3) || (8 > 5)); // true
		 * System.out.println((5 > 3) || (8 < 5)); // true System.out.println((5 < 3) ||
		 * (8 < 5)); // false
		 * 
		 * // ! operator System.out.println(!(5 == 3)); // true System.out.println(!(5 >
		 * 3)); // false
		 */	
		
		//Unary
		
		/*
		 * // declare variables int a = 12, b = 12; int result1, result2;
		 * 
		 * // original value System.out.println("Value of a: " + a);
		 * 
		 * // increment operator result1 = ++a; System.out.println("After increment: " +
		 * result1);
		 * 
		 * System.out.println("Value of b: " + b);
		 * 
		 * // decrement operator result2 = --b; System.out.println("After decrement: " +
		 * result2);
		 */
		
		/*
		 * //Java instanceof Operator
		 * 
		 * String str = "welcome"; boolean result;
		 * 
		 * // checks if str is an instance of // the String class result = str
		 * instanceof String; System.out.println("Is str an object of String? " +
		 * result);
		 */
		
		//Ternary
		
		int februaryDays = 29;
	    String result;

	    // ternary operator
	    result = (februaryDays == 29) ? "Not a leap year" : "Leap year";
	    System.out.println(result);
	}
	
	
}
