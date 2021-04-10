import java.lang.*;
import java.util.*;
class IntegerAdd
{
	static int add(int a,int b,int c,int d,int e)
	{
		return (a+b+c+d+e);
	}
}
class IntAdd
{
	public static void main(String args[])
	{
			IntegerAdd a = new IntegerAdd();
			System.out.println(IntegerAdd.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4])));
	}
} 