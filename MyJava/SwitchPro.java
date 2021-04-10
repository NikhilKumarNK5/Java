import java.lang.*;
import java.util.*;
public class SwitchPro
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1-3");  
		n = sc.nextInt();
		switch(n)
		{
			case 1 : System.out.println("One");
			break;
			case 2 : System.out.println("Two");
			break;
			case 3 : System.out.println("Three");
			break;
			default : System.out.println("Invalid");
			break;
		}
	}
}