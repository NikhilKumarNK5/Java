//Find sum of n natural numbers - 1+2+3+4+...
import java.lang.*;
import java.util.*;
public class SumNat
{
	public static void main(String args[])
	{
		int n;
		int sum = 0 ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{	
			sum = sum+i;
			//System.out.println("Sum = "+sum);//this will display the sum stepwise
		}
			System.out.println("Sum of "+n+" numbers is "+sum);//this will display the last value of sum
	}
}