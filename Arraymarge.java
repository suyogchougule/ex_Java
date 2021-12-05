//40.Java program to merge two arrays store them in another  array and print
//import java.util.*;
public class Arraymarge
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int[] b={6,7,8,9,10};    //int[] a=new int[5];
		
		int a1=a.length;
		int b1=b.length;
	
		int c1=a1+b1;

		int[] c= new int[c1];

		System.arraycopy (a,0,c,0,a1);//
		System.arraycopy(b,0,c,a1,b1);

		
		for(int i=0;i<c1;i++)
		{
			System.out.println(c[i]);
		}
			
		//or print array ilke this but import java.util.*;
		//System.out.println(Arrays.toString(c));
		
	}
}