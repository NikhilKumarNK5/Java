/*Develop an employee pay generator that works on the following rules-

1.	An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
2.	For every hour over 40, they get overtime = (base pay) × 1.5.

3.	The base pay must not be less than the minimum wage ($8.00 an hour).

4.	If it is, print an error. If the number of hours is greater than 60, print an error message.*/

import java.lang.*;
import java.util.*;
public class Corporation 
{
    static final double minWage = 8.0; 
    static final int maxHours = 60; 
    static double basePay=0; 
    static int hoursWorked=0;


    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);
        for (int i=1; i<=3; i++, System.out.println())
		{
           System.out.println("Employee Number: " + i);
           System.out.println("Enter Base Pay:");
           basePay = in.nextDouble();
           System.out.println("Enter Hours Worked:");
           hoursWorked = in.nextInt();
           salaryCalc(); 
        }
    }
     public static void salaryCalc()
	{
        double totalSalary = 0;
        if ((basePay < minWage) || (hoursWorked > maxHours))
		{
            System.out.println("Error!");
        }
        else {   

        if (hoursWorked > 40)
				{
                    totalSalary = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
                }
                else 
				{
                    totalSalary = basePay * hoursWorked;
                }
                System.out.println("Your total salary is " + totalSalary);
            }
    }

}