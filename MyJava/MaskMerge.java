import java.lang.*;
class MaskMerge
{
	public static void main(String args[])
	{
		/*int a=10 , b=15;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);*/

		byte a=9,b=12;
		byte c;
		c=(byte)(a<<4);//type casting 
		c=(byte)(c|b);
 
		System.out.println((c&0b11110000)>>4);
		System.out.println((c&0b00001111)>>4);
	}
}