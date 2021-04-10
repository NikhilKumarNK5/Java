//Dispplay Digits of a number
//257 = 2 , 5 , 7
import java.lang.*;
import java.util.*;
public class Digits
{
	public static void main(String args[])
	{
		int n,i;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		while(n>0)
		{
			r = n%10;//257%10=7 , 25%10=5 2%10 = 2
			n = n/10;//257/10=25 , 25/10 = 2 , 2/10 = 0
			System.out.println(r);
		}
			System.out.println(n);
	}
}