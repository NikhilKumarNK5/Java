import java.util.*;
class Waffle
{
	String flavour ;
	int price;
	Waffle( String f , int p)
	{
		flavour= new String(f);
		price= p;
	}
	public	String toString()
	{
		return " " + flavour + "  " +price ;
	}	
}	
class WaffleMain
{	
	public static void main( String[] args)
	{	
		String F ;
		int P;
		System.out.println( "Enter the flavour you want");
		Scanner sc= new Scanner( System.in);
		F= sc.nextLine();
		System.out.println( "Enter the price you can pay");
		P= sc.nextInt();
		Waffle obj = new Waffle("Chocolate", 100);
		System.out.println( "Does the default value of entered flavour and user flavour matches?");
		if( obj.flavour.equals(F))
		{
			System.out.println("Yes it matches with defalut value of flavour ");
		}
		else
		{
			System.out.println( "It does not matche with the default value of flavour");
		}				
		System.out.println( "Does the default value of price matches?");
		if(obj.price == P)
		{
			System.out.println("Yes default value of price matches ");
		}
		else
		{
			System.out.println( "It does not matches");
		}
		System.out.println( "The default values of flavour and price are" + obj.toString());		
	}
}
