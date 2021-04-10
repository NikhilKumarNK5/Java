//Increasing size of an Array
import java.lang.*;
import java.util.*;
class IncSizeArr 
{
	public static void main(String args[])
	{
		int A[] = {1,2,3,4,5};
		int B[] = new int[2*A.length];
		System.out.println("Elements of original Array");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		for(int i=0;i<A.length;i++)
		{
			B[i] = A[i];
		}
		A = B;
		B = null;
		System.out.println(A.length);
		System.out.println("Elements of New Array");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
}