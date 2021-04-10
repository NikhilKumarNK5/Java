//Finding max element in an array
import java.lang.*;

class MaxArr
{
	public static void main(String args[])
	{
		int A[] = {3,4,5,6,7,8,8,9,10,11,12};
		int max = A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max = A[i];
			}
		}

			System.out.println("Largest Element : "+max);
	}
}