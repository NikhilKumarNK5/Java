/*
class Palindrome extends Thread
{
	//Extending Thread class
	
	public void palindrome()
	{
		int count=0,rem,sum=0,temp;
		
		for (int i=100;i<=1000; i++)
		{
			temp = i;
			while(temp>0)
			{
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/ 10;
			}
			if(sum==i)
			{
				System.out.print(i + " ");
				count++;
			}
			if(count==20)
			{
				break;
			}
			sum=0;
		}
	}

	public void run()
	{
		palindrome();
	}

}
*/

class Palindrome implements Runnable
{
	
	public void palindrome()
	{
		int count=0,rem,sum=0,temp;
		for (int i=100;i<=1000; i++)
		{
			temp = i;
			while(temp>0)
			{
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/ 10;
			}
			if(sum==i)
			{
				System.out.print(i + " ");
				count++;
			}
			if(count==20)
			{
				break;
			}
			sum=0;
		}
	}

	public void run()
	{
		palindrome();
	}	
}

public class PalindromeThread
{
	public static void main(String[] args)
	{
		/*
		Palindrome p = new Palindrome();
		p.start();   //Thread class
		*/   
		
		Palindrome p = new Palindrome();
		Thread t = new Thread(p);
		t.start();	 //Runnable Interface
	}
} 



