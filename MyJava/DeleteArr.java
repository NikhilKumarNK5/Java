//Deleting an Element
import java.lang.*;
import java.util.*;
class DeleteArr
{
	public static void main(String args[])
	{
		int A[] = {1,2,3,4,5};
		int arr[] = new int[A.length-1];
		int j = 3;
		for(int i=0,k=0;i<A.length;i++)
		{
			if(i!=j)//delete j(that is element at jth index)
			{
				arr[k] = A[i];
				k++;
			}
		}
		System.out.println("Before Deletion : "+Arrays.toString(A));
		System.out.println("After Deletion : "+Arrays.toString(arr));
	}
}