/*class GravityCalculator
{
	public static void main(String[] args)
	{
		try
		{
			double result = (0.5*(Math.pow(-9.81*10,2)))+(0*10)+0;
			System.out.println("Gravity Calculator = "+result);
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero " + e.toString());
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
	}
}*/

import java.util.Scanner;

public class GravityCalculator
{
    static Scanner sc = new Scanner(System.in);
    static int xi, vi = 0;

    public static void main(String[] args) 
	{
        try 
		{
            gcMenu();
        } 
		catch (NumberFormatException exception)
		{
            System.out.println(exception.toString());
        }
    }

    static void gcMenu() 
	{
        boolean flag = true;
        while (flag) 
		{
            System.out.println("\nEnter\n 1.Set initial position and initial velocity(Default=0)\n 2.Calculate position\n 4.Exit: ");
			System.out.println("Enter your choice");
            int inp = sc.nextInt();
            switch (inp) 
			{
                case 1:
                    System.out.println("Enter initial position and initial velocity: ");
                    xi = sc.nextInt();
					vi = sc.nextInt();
                    break;
                case 2:
                    if (xi == 0) 
					{
                        throw new NumberFormatException();
                    }
                    System.out.println(calcPosition());
                    break;
                default:
                    flag = false;
                    break;
            }
			
			
        }
    }

    static double calcPosition() 
	{
        return (0.5 * (-9.81 * (10 * 10)) + (vi * 10) + xi);
    }
}

