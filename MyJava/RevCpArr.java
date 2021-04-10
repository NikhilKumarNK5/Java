//Reverse Copying an Array
import java.lang.*;
import java.util.*;
class RevCpArr
{
	public static void main(String args[])
	{
		int A[] = {1,2,3,4,5,6,7,8};
		int B[] = new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j] = A[i];
		}
		System.out.println("Elements of original Array");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		System.out.println("Elements of New Array");
		for(int i=0;i<B.length;i++)
		{
			System.out.print(B[i]+" ");
		}
		System.out.println();
	}
}