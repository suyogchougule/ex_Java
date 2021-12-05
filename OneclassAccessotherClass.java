//42.program to acces one class into another calss

public class OneclassAccessotherClass
{
	public static void main(String[] args)
	{
		addition obj=new addition();
		//System.out.println(obj.print1());				
	}

}
	
class addition
{

	int a=10,b=20;
	int c=a+b;
	
	public addition()
	{
		System.out.println(c);
	}
	
	 
}