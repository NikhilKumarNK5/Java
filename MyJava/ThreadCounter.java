public class ThreadCounter 
{
    private int counter = 0;
    public static void main(String[] args) throws InterruptedException 
	{
        long startTime = System.currentTimeMillis();
        ThreadCounter sharedCounter1 = new ThreadCounter();

        Thread thread1 = new Thread(() -> sharedCounter1.increment());
        thread1.start();
        Thread thread2 = new Thread(() -> sharedCounter1.increment());
        thread2.start();
        Thread thread3 = new Thread(() -> sharedCounter1.increment());
        thread3.start();
        Thread thread4 = new Thread(() -> sharedCounter1.increment());
        thread4.start();
        Thread thread5 = new Thread(() -> sharedCounter1.increment());
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Counter: " + sharedCounter1.counter);
        System.out.println("Total time taken(in millis): " + (endTime - startTime));
    }

    public void increment() {
        for (int i = 0; i < 100; i++)
		{
            synchronized (ThreadCounter.class) 
			{
				System.out.println(Thread.currentThread().getName());
                counter++;
            }
        }
    }
}