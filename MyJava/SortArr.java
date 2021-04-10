//How to Sort an Array of Strings
import java.lang.*;
import java.util.*;
class SortArr
{
	public static void main(String args[])
	{
		String arr[] = {"Java","Python","Pascal","Smalltalk","Ada","Basic"};//Array of objects - string is a class
		java.util.Arrays.sort(arr);
		for(String x:arr)
		{
			System.out.println(x);
		}
	}
}