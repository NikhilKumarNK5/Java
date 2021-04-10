//Multiplying 2 matrics
//no of columns of 1st matrix should be equal to the no of rows of 2nd matrix
//outer loop - rows
//inner loop - columns
import java.lang.*;
import java.util.*;
class MultiMat
{
	public static void main(String args[])
	{
		int A[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
		int C[][] = new int[3][3];
		
		System.out.println("Matrix A");
		for(int x[]:A)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

		System.out.println("Matrix B");
		for(int x[]:B)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{	
				C[i][j] = 0;
				for(int k=0;k<3;k++)
				{
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
		}

		System.out.println("Matrix C");
		for(int x[]:C)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}