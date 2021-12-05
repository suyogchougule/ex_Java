package Basic;

public class CompoundIntrest {
	public void compound(int p, int t,double r, int n)
	{
	
	double amount=p * Math.pow(1 + ( r / n), n*t);
	double compoundint=amount-p;
	System.out.println("compound intrest affter "+ t + " year=" + compoundint );
	System.out.println("Amount affter " + t +" years=" + amount);
	
	}
	
	
	public static void main(String[] args)
	{
		CompoundIntrest obj =new CompoundIntrest();
		obj.compound(1000, 5, .08, 120);
		
	}

}
