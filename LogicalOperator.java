package Basic;

public class LogicalOperator {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=30;
		int d;
		
		System.out.println("Var1="+a);
		System.out.println("Var2="+b);
		System.out.println("Var3="+c);
		
		
		System.out.println("Logical And Operator ");
		if(a<b && b<c )
		{
			d=a+b+c;
			System.out.println("Addition of 3 variable="+d );
		}
		else
		{
			System.out.println("False condition");
		}
		
		
		
		
		System.out.println("logical OR operator ");
		if(a>b || b>c )
		{
			d=a+b+c;
			System.out.println("Addition of 3 variable="+d );
		}
		else
		{
			System.out.println("False condition");
		}
	
		
		System.out.println("Logical Not operator"); 
		System.out.println("!(a<b)="+!(a<b));
		System.out.println("!(a>b)="+!(a>b));
		
	}

}
