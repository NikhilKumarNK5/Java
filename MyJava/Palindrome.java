//Palindrome Number
//n=12421 rev = 12521 
// if rev = n  then no is palindrome
import java.lang.*;
import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int m = n; //preserving the value of n here because we need it later and at the end of the loop n will turn to 0
		int r;
		int rev = 0;
		
		while(n>0)
		{
			r = n%10;
			n = n/10;
			rev = rev*10+r;
			
		}
		System.out.println("Reverse = "+rev);
		if(rev==m)
		{
			System.out.println("It is a Palindrome Number");
		}
		else 
		{
			System.out.println("It is not a Palindrome Number");
		}
	}
}