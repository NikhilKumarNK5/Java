//Dispaly GP Series
// 2 6 18 54 ........ r=3 a=2 t=ar^(n-1)
import java.lang.*;
import java.util.*;
public class GPSeries
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to Print GP Series");
		System.out.println("Enter a , r , n");
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int term = a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+" ");
			term = term*r;
		}
	}
}