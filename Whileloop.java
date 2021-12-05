package Basic;

public class Whileloop {
	
	public static void  table(int t)
	{
		int a=1;
		while(a<=10)
		{
			int ta=t*a;
			a=a+1;
			System.out.println(ta);
		
		}
	}
	public static void main(String[] args)
	{
		int num=2;
		table(num);
		
	}
}