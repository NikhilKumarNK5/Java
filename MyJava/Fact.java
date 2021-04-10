//Find factorial of a number
import java.lang.*;
import java.util.*;
public class Fact
{
	public static void main(String args[])
	{
		int n;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
			System.out.println("Factorial of "+n+" = "+fact);
	}
}