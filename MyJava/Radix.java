/*Find the radix of a given number in String*/
//Radix 2 - Binary
//Radix 8 - Octal
//Radix 16 - HexaDecimal
//Radix 10 - Decimal
import java.lang.*;
import java.util.*;
class Radix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String num;
		System.out.println("Enter a Number");
		num = sc.nextLine();
		if(num.matches("[01]+"))
		{
			System.out.println("Binary Radix = 2");
		}
		else if(num.matches("[0-7]"))
		{
			System.out.println("Octal Radix = 8");
		}
		else if(num.matches("[0-9]"))
		{
			System.out.println("Decimal Radix = 10");
		}
		else if(num.matches("[0-9A-F]"))
		{
			System.out.println("HexaDeciaml Radix = 16");
		}
		else
		{
			System.out.println("Not a Number");
		}
	}
}