/*Find a given year is leap year*/
import java.lang.*;
import java.util.*;
class Year
{
	public static void main(String args[])
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		year = sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("It's a leap year");
				}
				else
				{
					System.out.println("It's not a leap year");
				}
			}
			else
			{
				System.out.println("It's a leap year");
			}
		}
		else
		{
			System.out.println("It's not a leap year");
		}
	}
}