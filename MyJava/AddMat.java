//Adding 2 matrices
//Matrices of the same order can only be added
//outer loop - rows
//inner loop - columns
import java.lang.*;
import java.util.*;
class AddMat
{
	public static void main(String args[])
	{
		int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
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
				C[i][j] = A[i][j]+B[i][j];
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