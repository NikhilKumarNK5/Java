//Validate name and age of a person
import java.lang.*;
import java.util.*;
class Valid
{
	static boolean validate(String name)
	{
		return name.matches("[a-zA-Z\\s]+");
	}
	static boolean validate(int age)
	{
		return age>=3 && age<=15;
	}
	public static void main(String args[])
	{
		String n = "Nikhil Kumar";
		System.out.println(validate(n));
		int a = 22;
		System.out.println(validate(a));
	}
}