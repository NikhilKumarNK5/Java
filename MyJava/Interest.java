/*A Financial Calculator to calculate the SimpleInterest and CompoundInterest by taking command line values for principal, rate and time.
1.	Extend the code to calculate ‘Final Value’ of investment (V) of an investment (principal P) compounded yearly for T years at interest rate R is given by the formula: V = P (1 + R)^T
2.	Perform the above code using a function and call it in main().
Make another class and a function in it to perform the above task.
*/
import java.lang.*;
import java.util.*;

class Calc
{
	static double simple(double principle , double rate , double time)
	{
		return (principle*rate*time/100);
	}
	static double compound(double principle , double rate , double time)
	{
		double a;
		rate = (1+rate/100);
		rate = Math.pow(rate,time);
		a = principle*rate;
		double ci = a - principle;
		return ci;
	}
	static double finalVal(double principle , double rate , double time)
	{
		double V;
		rate = (1+rate/100);
		rate = Math.pow(rate,time);
		V = principle*rate;
		return V;
	}
}
public class Interest
{
	public static void main(String args[])
	{
		Calc obj = new Calc();
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		//double n = Double.parseDouble(args[3]);
		System.out.println("Simple Interest "+Calc.simple(p,r,t));
		System.out.println("Compound Interest "+Calc.compound(p,r,t));
	System.out.println("Total Amount "+Calc.finalVal(p,r,t));
	}
}