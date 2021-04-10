import java.lang.*;
class Bitwise
{
	public static void main(String args[])
	{
		int x=0b1010;
		int y=0b0110;
		int z,w,m,n,o,p,q;
		z=x&y;
		w=x|y;
		m=x^y;
		n=x<<1;
		o=x>>1;
		p=x>>>1;
		q=~x;
		System.out.println(z);
		System.out.println(w);
		System.out.println(m);
		System.out.println(n);
		System.out.println(String.format("%s",Integer.toBinaryString(x)));
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
	}
}