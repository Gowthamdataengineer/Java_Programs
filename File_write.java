package java_example;

import java.io.FileWriter;

public class File_write {

	public static void main (String args[]){
		
		try {
			
			FileWriter obj = new FileWriter("E:\\Users\\out.txt");
			obj.write("hello , how are you ");
			obj.close();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("success");
	}
}
