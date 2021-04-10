class PalindromeThread extends Thread
{
	public void run()
	{
		System.out.println("List of Palindrome between 100 to 1000");
           for(int i=100; i<=1000; i++)
		   {
                char[] ar = String.valueOf(i).toCharArray();
                boolean isPalindrome = true;
                for(int j=0;j<ar.length/2;j++)
				{
                    if(ar[j]!=ar[ar.length-1-j])
					{
						isPalindrome =false;
						break;
                    }
                }
                if(isPalindrome)
				{	
					System.out.println(i+ "Extends Thread");
				}
		   }
	}
}
class PaliThread implements Runnable
{
	public void run()
	{
		System.out.println("List of Palindrome between 100 to 1000");
           for(int i=100; i<=1000; i++)
		   {
                char[] ar = String.valueOf(i).toCharArray();
                boolean isPalindrome = true;
                for(int j=0;j<ar.length/2;j++)
				{
                    if(ar[j]!=ar[ar.length-1-j])
					{
						isPalindrome =false;
						break;
                    }
                }
                if(isPalindrome)
				{	
					System.out.println(i+ "Implements Runnable");
				}
		   }
	}
}
public class ThPalindrome 
{
    public static void main(String[] args)
	{
        PalindromeThread a = new PalindromeThread();
		a.start();
		PaliThread x = new PaliThread();
		Thread b = new Thread(x);
		b.start();
    }
}