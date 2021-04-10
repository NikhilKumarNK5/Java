//2-D Array
import java.lang.*;
import java.util.*;
class Arr2D
{
	public static void main(String args[])
	{
		int A[][] = new int[5][5];
		int B[][] = {{1,2,3},{2,4,6},{1,3,5}};
		/*int C[][];
		C = new int[5][5];
		int [][]D = new int[5][5];
		int []D[] = new int[5][5];
		int[] E,F[];
		E = new int[5];//E is 1-D (int[] E)
		F = new int[5][5];//F is 2-D (int[]F[])*/
		
		/*for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[0].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}*/

		for(int x[]:B)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}