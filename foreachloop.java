package test;

public class foreachloop {
	public static void main(String[] args)
    {
		int sum=0;
		int[] names = {1,2,1,2};
		for (Integer i : names) {
		  sum +=i;	
		  //0+=1 = 1+ =2 =3+ =1 =4+ =2 =6+
		  System.out.println(sum);//1,3,4,6
		}
		
    }
}
