 import java.lang.*;
import java.util.*;
class Arr
{
	public static void main(String args[])
	{
		int A[] = new int[10];//object created in heap
		int B[] = {1,2,3,4,5};
		int C[];
		C = new int[10];//not initialized or no value entered so printing this will give all zeroes(0)
		int[] D = new int[5];
		B[2]=15;
		for(int i=0;i<B.length;i++)
		{
			System.out.println(B[i]++);
		}
		for(int x:B)
		{
			System.out.println(x);
		}
	}
}
//we can modify the values of array by for loop but we cannot modify the vakue by foreach loop