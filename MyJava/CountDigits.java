//Count Digits of a Number
//257 = 2 , 5 , 7
import java.lang.*;
import java.util.*;
public class CountDigits
{
	public static void main(String args[])
	{
		int n;
		int r; int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		while(n>0)
		{
			n = n/10;//257/10=25 , 25/10 = 2 , 2/10 = 0
			count++;
		}
			System.out.println("Total Digits = "+count);
	}
}