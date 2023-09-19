package test;

public class ifstmt {

	public static void main(String[] args) {
		int mark=99;
		if(mark <= 40) {
			System.out.println("Fail");
		}
		else if (mark >= 41 && mark <=50)
		{
			System.out.println("Thrid class");
		}
		else if (mark >=51 && mark <=70)
		{
			System.out.println("Second class");
		}
		else 
		{
			System.out.println("First class");
		}

	}

}
