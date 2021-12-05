//34.java program to revers an array
public class Reverse
{
	public static void main(String[] args)
	{
		int i;
		int[] arr={1,2,3,4,5,6};
		int length=arr.length;
	
		for(i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse array ");
		
		int a=length-1;
		for(i=a;i>=0;i--)
		{
			System.out.println(arr[i]);		
		}

	}

}                                                                         