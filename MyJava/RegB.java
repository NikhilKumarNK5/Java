/*
Find if a Number is Binary or not
Find if a Number is HexaDecimal or not
Find if the data in date format (dd/mm/yyyy)
*/
import java.lang.*;
class RegB
{
	public static void main(String args[])
	{
		int b = 10110001;
		String str1 = "ABD12";
		String d = "01/12/2021";
		String str = String.valueOf(b);
		System.out.println(str.matches("[01]+"));//Binary
		System.out.println(str1.matches("[o-9A-F]+"));//HexaDecimal
		System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
		
	}
}