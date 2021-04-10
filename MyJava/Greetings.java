class ReverseGreeting extends Thread
{
	private int counter;
	public ReverseGreeting(int counter)
	{
		super("Thread" + counter);
		this.counter = counter;
	}
  
	public void run()
	{
		counter++ ;
		if(counter <= 51)
		{
			ReverseGreeting thr = new ReverseGreeting(counter);
			thr.start();
			try
			{
				thr.join();
				System.out.println("Hello from "+ getName()); 
			}
			catch (Exception e)
			{
				System.out.println("Exception");
			}
		}
	} 
}
public class Greetings
{
	public static void main (String args[])
	{
		ReverseGreeting th1 = new ReverseGreeting(1);
		th1.start();
	}
}