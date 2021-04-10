//Rotation of Array - left & right rotation
//Right Rotation
import java.lang.*;
class RRotArr
{
	public static void main(String args[])
	{
		int A[] = {3,4,5,6,7,8,9,10,5,6,1,2};
		for(int x:A)
		{
			System.out.print(x+" , ");
			
		}
		System.out.println("");
		int temp = A[A.length-1];
		for(int i=A.length-1;i>=0;i++)
		{
			A[i+1]=A[i]; 
		}
		A[0] = temp;
		for(int x:A)
		{
			System.out.print(x+" , ");
			
		}
		System.out.println("");
	}
}