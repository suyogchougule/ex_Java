//35.java program to sort an arry in ascending order
public class Ascending
{
	public static void  main(String[]args)
	{
		int i,j;
		int[] arr={1,2,5,6,4,3};

		for(i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
				
		int temp; 
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	

							
				}
			}	
		}

		System.out.println("----------------------------------------------");
		System.out.println("Arry in asending order");
		for(i=0;i<6;i++)
		{
			System.out.println(arr[i]);	
		}
				
	}
}
