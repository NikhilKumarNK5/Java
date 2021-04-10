import java.lang.*;
import java.util.*;
public class LoopEx
{
	public static void main(String args[])
	{
		int i=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		/*while(i<n)
		{
			System.out.println(i);
			i=i*2;
		}*/
		do
		{
			System.out.println(i);
			i=i*2;
		}while(i<n);
	}
}