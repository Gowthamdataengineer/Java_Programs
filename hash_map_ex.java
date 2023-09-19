package java_example;
import java.util.*;  

public class hash_map_ex {

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap
		map.put(1, "gowtham"); 
		map.put(2, "nandhu");
		map.put(3, "saravana");
		map.put(1, "rahul"); 

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
