package java_example;

public class String_ex {

	public static void main(String ar[]) {
		/*String s = "Gowtham";
		String b = "Nandhu";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println(s.concat(" "+b));
		System.out.println(s.substring(3));
		System.out.println(s.replace("Go", "sb"));
		System.out.println(s.length());
		System.out.println(s.charAt(3));*/
		
		String h ="1,gowtham,male,100";
		h.toString();
		String d[] =h.split(",");
		System.out.println(d[0]+", "+d[2]);
		
	}
}
