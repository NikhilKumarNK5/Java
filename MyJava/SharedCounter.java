class SharedCounter implements Runnable
{
	static int counter=0;
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			counter=counter+10;
			Thread.yield();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(counter);
	}
	
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			Thread t = new Thread(new SharedCounter());
			t.start();
			try
			{
				t.join();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
		}
		//Thread.yield();
	}
}
