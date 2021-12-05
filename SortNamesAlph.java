//38. java program to sort names of array alphbeticaly

public class SortNamesAlph
{
	public static void main(String[] args)
	{	
		String[] a={"suyog","tushar","sourabh","aditya","abhishek","shital"};
		// string[] a=new String();   /anothe way of declar array string
		String temp;
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;				
				}			
			}
			
		}
		for(int i=0;i<6;i++)
		{	
			System.out.println(a[i]);
		}	

	
	}

}