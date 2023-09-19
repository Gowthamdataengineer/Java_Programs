package java_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class emp implements Serializable {
	
	int eid;
	String ename;
	
	emp(int eid , String ename){
		this.eid=eid;
		this.ename= ename;
	}
	
}

 class ser_ex {
	 
	 public static void main (String args[]){
		 try{
		 /*emp obj = new emp(1,"gowtham");
		 
		 FileOutputStream fout = new FileOutputStream("E:\\Users\\stream.txt");
		 ObjectOutputStream a = new ObjectOutputStream(fout);
		 a.writeObject(obj);
		 a.flush();
		 a.close();
		 System.out.println("success");*/
			 
		  ObjectInputStream b = new ObjectInputStream(new FileInputStream("E:\\Users\\stream.txt"));
		  emp d =(emp)b.readObject();
		  System.out.println(d.eid+","+d.ename);
		  b.close();
		 }
		 catch (Exception e){
			 System.out.println(e);
		 }
		 
	 }

		 
}
