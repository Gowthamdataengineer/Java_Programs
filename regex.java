package java_example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	 public static void main(String[] args)
	    {
		 /*String email= "user@gmail.com";
		 String regex = "^(.+)@(.+)$";

		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 
		 System.out.println(email +" : "+ matcher.matches());*/
		 
		 
		 
		   /* Pattern p = Pattern.compile("\\d+");
	        Matcher m = p.matcher("string1234more567string890");
	        while(m.find()) {
	            System.out.println(m.group());
	        }*/
		 
		 
		   String REGEX = "cls";
		   String INPUT = "welcome to the cls";
		   String REPLACE = "class";
		   
		 Pattern p = Pattern.compile(REGEX);
	      //get a matcher object
	      Matcher m = p.matcher(INPUT);
	      INPUT = m.replaceAll(REPLACE);
	      System.out.println(INPUT);
	      
	    }
}
