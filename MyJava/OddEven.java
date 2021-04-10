/*Find a no is odd or even*/
import java.lang.*;
import java.util.*;
class OddEven
{
	public static void main(String args[])
	{
		int n;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number to check Even or Odd");
		n = sc.nextInt();
		if(n%2==0)
		{
			System.out.print("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}