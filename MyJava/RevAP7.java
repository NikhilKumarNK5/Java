/*A java standalone application reads in a sentence from the user and prints it out with each word reversed, but with the words and punctuation in the original order.*/
import java.lang.*;
import java.util.*;
class StringFormat 
{  
	public static String reverse(String str)
	{  
		String words[]=str.split("\\s");  
		String reverse="";  
		for(String w:words)
		{  
			StringBuilder sb=new StringBuilder(w);  
			sb.reverse();  
			reverse+=sb.toString()+" ";  
		}  
		return reverse.trim();  
	}  
}  
public class RevAP7 {  
public static void main(String[] args) {  
	String str;
    System.out.println("Enter Sentence : ");
    Scanner sc = new Scanner(System.in);
	str = sc.nextLine();
    System.out.println(StringFormat.reverse(str));  
    }  
}  