import java.lang.*;
import java.util.*;
public class LoopFor
{
	public static void main(String args[])
	{	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt(); 
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
	}
}