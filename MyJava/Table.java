//Display Multipilcation Table
import java.lang.*;
import java.util.*;
public class Table
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}