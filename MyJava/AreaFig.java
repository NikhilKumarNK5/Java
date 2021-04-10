//Method Overloading
//Area of Rectangle = l*b
//Area of Circle = Math.PI*r*r
import java.lang.*;
import java.util.*;
class AreaFig
{
	static int area(int l,int b)
	{
		return l*b;
	}
	static double area(double r)
	{
		return Math.PI*r*r;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int l = sc.nextInt();
		System.out.println("Enter breadth of rectangle");
		int b = sc.nextInt();
		System.out.println(area(l,b));
		System.out.println("Enter Radius of Circle");
		double r = sc.nextDouble();
		System.out.println(area(r));
	}
}