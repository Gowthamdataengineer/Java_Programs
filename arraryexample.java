package test;

import java.util.ArrayList;

public class arraryexample {

	public static void main(String[] args)
    {
		//String [] b= {"tn","kl","ap"};
		//b[0]=tn , b[1]=kl, b[2]=ap
		
		/*
		 * String [] a = new String [100]; a[0]="tn"; a[1]="kl";
		 * 
		 * System.out.println(b.length);
		 */
		String data="1,gowtham,male,phone,10000";
		String a[]=data.split(",");
		//a[0]=1 //a[1]=gowtham //a[2]=male // a[3]=phone// a[4]=10000
		//System.out.println(a[1]);
		
		//Array List 
		
		 ArrayList<String> names = new ArrayList<>();

		    // Add elements to ArrayList
		 names.add("gowtham");
		 names.add("nandhu");
		 names.add("nila");
		 
		 //String str= names.get(2);
		 //names.set(0, "sb");
		 String str=names.remove(2);
		 System.out.println("ArrayList: " + names);
		
			
		
    }
}
