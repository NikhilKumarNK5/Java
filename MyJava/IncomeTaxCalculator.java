import java.util.*;

public class IncomeTaxCalculator
{
	public static void main(String args[])
	{
		double tax = 0;
		int it;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Income: ");
		it = sc.nextInt();
		if(it<=200000)
		{
			tax = 0;
		}
		else if(it<=400000)
		{
			tax = 0.1*(it - 200000);
		}
		else if(it<=600000)
		{
			tax = (0.2*(it-400000))+(0.1*200000);
		}
		else
		{
			tax = (0.3*(it-600000))+(0.2*200000)+(0.1*200000);
		}
		System.out.println("Tax on " +it+ " is " +tax);
	}
}