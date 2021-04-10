//Inserting an element in Array
//Insertion is possible only if free spaces are there in the array
import java.lang.*;
import java.util.*;
class InsertArr
{
	public static void main(String args[])
	{
		int A[] = new int[10];
		A[0] = 5;
		A[1] = 9;
		A[2] = 6;
		A[3] = 10;
		A[4] = 12;
		A[5] = 7;
		int n = 6;//no of elements
		for(int i=0;i<n;i++)
		
			System.out.print(A[i]+" , ");
		
		System.out.println("");
		int x = 20;
		int index = 2;
		for(int i=n;i>index;i--)
		
			A[i] = A[i-1];
		
		A[index] = x;
		for(int i=0;i<n;i++)
		
			System.out.print(A[i]+" , ");
		
		System.out.println("");
	}
}