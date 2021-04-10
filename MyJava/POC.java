import java.util.*;	
class POC
{	
	public static void main( String[] args)
	{
		String s;
		String text ;
		String str = "Nikhil" ;
		System.out.println("Character at 2nd position" +" " + str.charAt(1));
		System.out.println("Length of the string " +"  " + str.length());
		System.out.println("Checking if the string contains Ni" );
		if( str.contains("Ni"))
		{
			System.out.println("Yes it contains Ni");
		}
		else
		{
			System.out.println("It does not conatain Ni" );
		}
		System.out.println("Enter any string to do comaprison using ==");
		Scanner sc= new Scanner( System.in);
		s = sc.nextLine();
		if( str == s)
		{
			System.out.println("It is matching with the default string");
		}
		else
		{
			System.out.println("It is not matching");
		}
		System.out.println("Now we will be performing equals() method");
		System.out.println("Enter any string to do comaprison using equals method");
		text = sc.nextLine();
		text = new String(text);		
		if( str.equals(text))
		{
			System.out.println("It is a match");
		}
		else
		{
			System.out.println("It does not matches");
		}	
		System.out.println("Uppercase"+ " " + str.toUpperCase() );
	}
}

