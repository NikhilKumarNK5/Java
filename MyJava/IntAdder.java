import java.lang.*;
class Ap1
{
	public int Adder(String arg[])
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
}
class IntAdder
{
	public static void main(String args[])
	{
		Ap1 obj = new Ap1();
		int s = obj.Adder(args);
		System.out.println("Sum of five numbers = "+s);
	}
}