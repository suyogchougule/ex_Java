//43.java program to print number from 1 to 5 using recursion
//import java.util.*;
public class Recursion
{
	public static void main(String[]args)
	{
		int n=1;
		fun(n);		
	}	

	public static void fun(int a)
	{	
		if(a<=5)
		{
			System.out.println(""+a);
			a=a+1;
			fun(a);
			//break;  when use while()
		}
	}
} 