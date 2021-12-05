package Basic;

public class Fibonaccinumber {

	public void Febo(int n)
	{
		int a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		
		}
		
	}
	public static void main(String[] args)
{
		Fibonaccinumber obj = new Fibonaccinumber();
		obj.Febo(10);
}
}
