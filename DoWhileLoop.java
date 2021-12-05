package Basic;

public class DoWhileLoop {
	
	public static void table(int t)
	{
		int a=1;
		do {
			int ta=t*a;
			System.out.println(ta);
			a=a+1;
			
		}while(a<=10);
	}

	public static void main(String[] args)
	{
		int num=2;
		table(num);
		
	}
}
