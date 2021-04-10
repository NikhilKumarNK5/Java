//Dispaly AP Series
// 5 10 15 20 25 30 ........ d=5 a=5 t=a+(n-1)d
import java.lang.*;
import java.util.*;
public class APSeries
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to Ptint AP Series");
		System.out.println("Enter a , d , n");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int term = a;//so that we don't change the value of a and a remains constant
		for(int i=0;i<n;i++)
		{
			System.out.print(term+" ");
			term = term+n;
		}
	}
}