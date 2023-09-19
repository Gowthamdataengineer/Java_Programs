package java_example;

import java.io.FileReader;

public class File_reader {

	public static void main(String args[]) {
		try {
			 FileReader fr=new FileReader("E:\\Users\\out.txt");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
			
		} catch (Exception e) {
			System.out.println("success");
		}
	}
}
