/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25 
*/

import java.lang.*;
public class Pattern4
{
	public static void main(String args[])
	{	
		int count = 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				//System.out.print(++count+" ");
				count++;
				System.out.format("%2d ",count);//two spaces infront of single digit numbers and if we write 0 infront of 2 here then the blank spaces will be filled with 0
			}
			System.out.println();
		}
	}
}