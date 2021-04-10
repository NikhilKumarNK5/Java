/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
//i+j
import java.lang.*;
public class Pattern6
{
	public static void main(String args[])
	{
		int count = 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				//System.out.print(count+" " );
				System.out.format("%2d ",count);
			}
			System.out.println();
		}
	}
}