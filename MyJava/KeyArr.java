//Search an element in an array
//linear search
//traverse an array - use for / for each loop
import java.lang.*;
import java.util.*;
class KeyArr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int A[] = {3,4,5,6,7,8,8,9,10,11,12};
		int key;
		System.out.println("Enter a Key");
		key = sc.nextInt();
		for(int i=0;i<A.length;i++)
		{
			if(key==A[i])
			{
				System.out.println("Element found at index : "+i);
				System.exit(0);
			}
		}
		System.out.println("Element not found");//else is not written inside as for as long as we are inside the above loop we are traversing the array
		
	}
}