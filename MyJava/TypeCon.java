/*
Demonstrate type conversion in a simple java program by casting and checking output in the following cases:-
a)	Conversion of int to byte

b)	Conversion of double to int

c)	Conversion of double to byte

d)	Conversion of int to char

e)	Conversion of float to short

*/
import java.lang.*;
import java.util.*;
class TypeCon
{
   static byte intToByte(int n)
	{
		return (byte) n; // Conversion of int to byte
	}
	static int doubleToInt(double n)
	{
		return (int) n; // Conversion of double to byte
	}
	static byte doubleToByte(double n)
	{
		return (byte) n; // Conversion of double to byte
	}
	static char intToChar(int n)
	{
		return (char) n; // Conversion of int to char
	}
	static short floatToShort(float n)
	{
		return (short) n; // Conversion of float to short
	}

	public static void main(String args[])
	{
		byte b = 0;
		short s = 0;
		char c;
		int i = 0;
		int j;
		float f;
		double d;
		int ch;
		char choice = ' ';
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1. Conversion of int to byte ");
			System.out.println("2. Conversion of double to int ");
			System.out.println("3. Conversion of double to byte ");
			System.out.println("4. Conversion of int to char ");
			System.out.println("5. Conversion of float to short ");
			System.out.println("Enter your choice (1-5)");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Enter Integer ");
						 j = sc.nextInt();
						 b = intToByte(j);
						 System.out.println("Converted to Byte : "+b);
				break;
				case 2 : System.out.println("Enter Double ");
						 d = sc.nextDouble();
						 i = doubleToInt(d);
						 System.out.println("Converted to Int : "+i);
				break;
				case 3 : System.out.println("Enter Double ");
						 d = sc.nextDouble();
						 b = doubleToByte(d);
						 System.out.println("Converted to Byte : "+b);
				break;
				case 4 : System.out.println("Enter Integer ");
						 j = sc.nextInt();
						 c = intToChar(j);
						 System.out.println("Converted to Char : "+c);
				break;
				case 5 : System.out.println("Enter Float ");
						 f = sc.nextFloat();
						 s = floatToShort(f);
						 System.out.println("Converted to Short : "+s);
				break;
				default : System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue ? (Y/N)");
			choice = sc.next().charAt(0);
		}while(choice=='Y' || choice=='N');
	}
}

