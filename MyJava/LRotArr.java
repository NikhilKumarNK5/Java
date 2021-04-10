//Rotation of Array - left & right rotation
//Left Rotation
import java.lang.*;
class LRotArr
{
	public static void main(String args[])
	{
		int A[] = {3,4,5,6,7,8,9,10,5,6,1,2};
		for(int x:A)
		{
			System.out.print(x+" , ");
			
		}
		System.out.println("");
		int temp = A[0];
		for(int i=1;i<A.length;i++)//i initialised 1 as the first element is stored in a temp variable(0th index)
		{
			A[i-1]=A[i];
		}
		A[A.length-1] = temp;
		for(int x:A)
		{
			System.out.print(x+" , ");
			
		}
		System.out.println("");
	}
}