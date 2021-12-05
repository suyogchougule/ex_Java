//39.java program to print first largest and second largest number among element of array

public class LargeElementArray
{
	public static void main(String[] args)
	{
		int[] a={2,5,3,4,9,1};
		int temp,i,j;
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}			
			}	
		}
		System.out.println("Asecnding oreder of array Or Sorted Array");	
		for(i=0;i<6;i++)
		{
			System.out.println(a[i]);
			
	
		}
		System.out.println("Fisrdt largest number is "+a[6-1]+" And Second largest number is "+a[6-2]);
		
	}
}