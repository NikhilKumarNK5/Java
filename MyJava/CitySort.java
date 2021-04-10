import java.lang.*;
import java.util.*;
/*class CitySort
{
	public static void main(String args[])
	{
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		String f = args[5];
		
	}
	
}*/
	class CitySort
	{
		public static void main( String args[])
		{	
		int count;
		String temp;
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the number of strings you want to enter");
		count = sc.nextInt(); 
		System.out.println("Enter the strings through command line arguments");
		
		for( int i=0; i<count ;i++)
		{
				for( int j=i+1; j<count; j++)
				{
					if( args[i].compareTo(args[j])>0)
					{
						temp = args[i];
						args[i] = args[j];
						//args[j] = args[i];
						args[j] = temp;
					}
				}
		}
			System.out.println("sorted strings are");
			for( int i=0; i<count; i++)
			{
				System.out.print(args[i] + " , ");
			}
		}		
	}	

