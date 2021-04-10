//Sium of all elements in an array
import java.lang.*;
class SumArr
{
	public static void main(String args[])
	{
		int A[] = {3,4,5,6,7,8,8,9,10,11,12};
		int sum = 0;
		for(int i=0;i<A.length;i++)
		{
			sum = sum+A[i];
		}
		System.out.println("Sum of Elements of Array = "+sum);
		/*
			for(int x:A)//Sum using foreach loop
			{
				sum = sum+x;
			}
		*/
	}
}