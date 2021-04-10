import java.time.LocalDate;
import java.util.Scanner;
interface Account
{
    void openaccount(int amount);
    void closeaccount();
    void withdraw(int amount);
    void deposit(int amount);
    void transfer(int amount);
}
class Current implements Account
{
    int balance;
    public void openaccount(int amount)
    {
        LocalDate o = LocalDate.now();
        balance = amount;
        System.out.println("Account opened on : " + o + " with amount : " + balance + " Type: Current");
    }
    public void closeaccount()
    {
        LocalDate o = LocalDate.now();
        System.out.println("Account closed on : " + o);
        balance = 0;
    }
    public void withdraw(int amount)
    {
        if (balance >= amount) 
		{
            LocalDate o = LocalDate.now();
            System.out.println(amount + " withdrawn form account on : " + o + " new balance = " + (balance - amount)
                    + " Type: Current");
            balance -= amount;
        }
    }
    public void deposit(int amount)
    {
        LocalDate o = LocalDate.now();
        System.out.println(
                amount + " deposited to account on : " + o + "New balance = " + (balance + amount) + " Type: Current");
        balance += amount;
    }
    public void transfer(int amount)
    {
        if (balance >= amount) 
		{
            LocalDate o = LocalDate.now();
            System.out.println(amount + " transfered form account on : " + o + " new balance = " + (balance - amount)
                    + " Type: Current");
            balance -= amount;
        }
    }
}
class Savings implements Account
{
    int balance;
    public void openaccount(int amount)
    {
        LocalDate o = LocalDate.now();
        balance = amount;
        System.out.println("Account opened on : " + o + " with amount : " + balance + " Type: Savings");
    }
    public void closeaccount()
    {
        LocalDate o = LocalDate.now();
        System.out.println("Account closed on : " + o);
        balance = 0;
    }
    public void withdraw(int amount)
    {
        if (balance >= amount) 
		{
            LocalDate o = LocalDate.now();
            System.out.println(amount + " withdrawn form account on : " + o + " new balance = " + (balance - amount)
                    + " Type: Savings");
            balance -= amount;
        }
    }
    public void deposit(int amount)
    {
        LocalDate o = LocalDate.now();
        System.out.println(
                amount + " deposited to account on : " + o + "New balance = " + (balance + amount) + " Type: Savings");

        balance += amount;
    }
    public void transfer(int amount)
    {
        if (balance >= amount) 
		{
            LocalDate o = LocalDate.now();
            System.out.println(amount + " transfered form account on : " + o + " new balance = " + (balance - amount)
                    + "Type: Savings");
            balance -= amount;
        }
    }
}

class Bank 
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.println("Press 1 for Savings Account mode and 2 for Current Account Mode: ");
        int acc = s.nextInt();
		int bal;
        if (acc == 1) 
		{
            System.out.println("Press 1 to Open Account: ");
            System.out.println("Press 2 to Close Account: ");
            System.out.println("Press 3 to Deposit: ");
            System.out.println("Press 4 to Withdraw: ");
            System.out.println("Press 5 to Trasfer: ");
            System.out.println("Press 0 to Exit: ");
            int i = s.nextInt();
            Savings o1 = new Savings();
            while (i != 0)
            {
                if (i == 1) 
				{
                    o1.openaccount(20000);
                }
                else if (i == 2) 
				{
                    o1.closeaccount();
                }
                else if (i == 3) 
				{
					System.out.println("Enter the amount you want to deposit");
					bal = s.nextInt();
                    o1.deposit(bal);
                }
                else if (i == 4) 
				{
					System.out.println("Enter the amount you want to withdraw");
					bal = s.nextInt();
                    o1.withdraw(bal);
                }
                else if (i == 5) 
				{
					System.out.println("Enter the amount you want to Transfer");
					bal = s.nextInt();
                    o1.transfer(bal);
                }

                i = s.nextInt();
            }
        }
        else if (acc == 2) {
            System.out.println("Press 1 to Open Account: ");
            System.out.println("Press 2 to Close Account: ");
            System.out.println("Press 3 to Deposit: ");
            System.out.println("Press 4 to Withdraw: ");
            System.out.println("Press 5 to Trasfer: ");
            System.out.println("Press 0 to Exit: "); 
            int i = s.nextInt();
            Savings o1 = new Savings();
            Current o2 = new Current();
            while (i != 0)
            {
                if (i == 1) 
				{
                    o2.openaccount(5000);
                }
                else if (i == 2) 
				{
                    o1.closeaccount();
                }
                else if (i == 3) 
				{
					System.out.println("Enter the amount you want to deposit");
					bal = s.nextInt();
                    o1.deposit(bal);
                }
                else if (i == 4) 
				{
					System.out.println("Enter the amount you want to withdraw");
					bal = s.nextInt();
                    o1.withdraw(bal);
                }
                else if (i == 5) 
				{
					System.out.println("Enter the amount you want to Transfer");
					bal = s.nextInt();
                    o1.transfer(bal);
                }
                i = s.nextInt();
            }
        }
    }
}
