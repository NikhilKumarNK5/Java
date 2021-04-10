/*Find grades for given marks*/
import java.lang.*;
import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		String sub1,sub2,sub3;
		int m1,m2,m3;
		int total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of 3 subjects");
		sub1 = sc.nextLine();
		sub2 = sc.nextLine();
		sub3 = sc.nextLine();
		System.out.println("Enter the marks of the 3 subjects");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		
		total = m1+m2+m3;
		avg = total/3;
		if(avg>=80)
		{
			System.out.println("Grade A");
		}
		else if(avg>=60 && avg<80)
		{
			System.out.println("Grade B");
		}
		else if(avg>=40 && avg<60)
		{
			System.out.println("Grade C");
		}
		else 
		{
			System.out.println("Grade D");
		}
	}
}