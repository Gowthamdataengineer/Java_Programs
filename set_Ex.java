package java_example;

import java.util.*;

public class set_Ex {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet<String> s1 = new HashSet<String>();
		s1.add("gowtham");
		s1.add("nila");
		s1.add("nandhu");
		s1.add("ram");
		// Traversing elements
		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		s1.remove(2);  
        System.out.println(s1);  
	}
}
