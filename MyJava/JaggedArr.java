/*Use Jagged array to create this:
1
123
12345
1234567
123456789
*/
import java.lang.*;
import java.util.*;

class JaggedArr
{
	public static void main(String args[])
	{
		int arr[][] = new int[5][];
		arr[0] = new int[]{1};
		arr[1] = new int[]{1,2,3};
		arr[2] = new int[]{1,2,3,4,5};
		arr[3] = new int[]{1,2,3,4,5,6,7};
		arr[4] = new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println("Contents of Ragged Array");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}