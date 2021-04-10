import java.lang.*;
class IntegerAdder
{
	static int Adder(String arg[])
	{
		int a,b,c,d,e,sum;
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
		c=Integer.parseInt(arg[2]);
		d=Integer.parseInt(arg[3]);
		e=Integer.parseInt(arg[4]);
		sum=a+b+c+d+e;
		return(sum);
	}
	
	public static void main(String args[])
	{
		int s = Adder(args);
		System.out.println("Sum of 5 Numbers = "+s);
	}
}