//Roots of Quadratic Equations
import java.lang.*;
import java.util.*;
class Equation
{
	public static void main(String args[])
	{
		int a,b,c;//these are coefficients of the equation and if we take values such that the descriminant becomes negative then we have will get the result of roots as NaN
		double r1,r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a , b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println("Roots are "+r1+"   "+r2);
	}
}