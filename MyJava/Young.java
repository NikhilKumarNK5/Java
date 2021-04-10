/*Find a person is young or not*/
import java.lang.*;
import java.util.*;
class Young
{
	public static void main(String args[])
	{
		String name = "";
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		name = sc.nextLine();
		System.out.println("Enter your age : " );
		age = sc.nextInt();
		if(age>=14 && age<=50)
		{
			System.out.println(name+" is Young");
		}
		else
		{
			System.out.println(name+" is not Young");
		}
	}
}