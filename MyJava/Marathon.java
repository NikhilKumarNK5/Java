import java.util.*;

class Marathon
{
	public static void main( String[] args)
	{		
		int position = 0;
		Scanner sc = new Scanner( System.in);
		Scanner s = new Scanner( System.in);
		String[] str = new String[16];
		int [] arr = new int[16];
		System.out.println( " Enter the names of 16 Players");
		for( int i=0; i<=15; i++)
		{
			str[i]= sc.nextLine();
		}
		System.out.println(" Enter the timings of the corresponding players");
		for( int j =0; j<=15; j++)
		{
			arr[j]= s.nextInt();
		}
		int min=arr[0];
		for( int k=1; k<=15;k++)
		{
			if(arr[k]<min)
			{
				min=arr[k];
				position =k;
			}					
		}
		System.out.println( " Minimum timing is of " + str[position] +" and the minimum timing is " + arr[position] );
	}
}

