//Fibonacci Series - Starts with 0th term and not first term
//0 1 1 2 3 5 8 13 21 ........ f(n) = f(n-2) + f(n-1) 
//every next term is obtained by adding previous two terms 
/*
	int a,b;
	a = b;
	b = c;
Every time we have to move the terms for adding and obtaining the sum of previous 2 terms
*/
import java.lang.*;
import java.util.*;
public class Fibo
{
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to Print Fibonacci Series");
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		int sum = 0;
		double avg = 0;
		System.out.println("Enter first two terms");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		System.out.print(a+" , "+b+" , ");
		for(int i=0;i<n-2;i++)
		{
			c = a+b;
			System.out.print(c+" , ");
			a = b;
			b = c;
			sum = sum + c;
			avg = sum/n;
		}
		System.out.println("\n Sum = "+sum);
		System.out.println("\n Average = " +avg);
	}
}