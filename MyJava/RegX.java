/*
Remove Special Characters from Strings
Remove Extra Spaces from String
Find the no of words in a String
*/
import java.lang.*;
class RegX
{
	public static void main(String args[])
	{
		String str = "a!B@C#|#2%3";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
		String str1 = "  abc   dc   fgh    ijkl   ";
		System.out.println(str1.replaceAll("\\s+"," ").trim());
		String str2 = "abc   de  fgh  ijkl";
		str2 = str2.replaceAll("\\s+"," ").trim();
		String words[] = str2.split("\\s");
		System.out.println(words.length );
	}
}