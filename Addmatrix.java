//37.java program to  perform additon of matrix
//Matrix addition 3x3.
public class Addmatrix
{
	public static void main(String[] args)
	{
		int[][] a={{1,2,3},{3,4,3},{1,2,3}};
		int[][] b={{1,2,3},{3,4,3},{1,2,3}};
		int c[][] =new int[3][3];
		

		for(int i=0;i<3;i++)
		{
			for(int j=0;i<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}