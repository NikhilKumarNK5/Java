import java.lang.*;
import java.util.*;
class Reciprocal 
{
    static double Reciprocator(int n) 
	{
        double sum = 0;
        for (int i=1;i<=n; i++)
        {
            sum = sum + (1.0 /i);
        }
        return sum;
    }
    static void display(int n) 
	{
        for (int i = 1; i <=n; i++)
		{
            System.out.print((1+"/"+i) + " + ");
        }
    }

    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length (1-10)");
        int len = sc.nextInt();
        double val = Reciprocator(len);
        System.out.print("Sum of : ");
        display(len);
        System.out.print(" is = "+val);
    }
}
