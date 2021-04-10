public class ReverseHello 
{
    public static void main(String[] args) throws InterruptedException 
	{
        HelloT[] helloT = new HelloT[50];
        for (int i = 0; i < 50; i++) 
		{
            helloT[i] = new HelloT(50 - i);
        }
        for (int i = 0; i < 50; i++) 
		{
            helloT[i].start();
            helloT[i].join();
        }
    }
}

class HelloT extends Thread 
{
    int num;

    HelloT(int num) 
	{
        this.num = num;
    }

    @Override
    public synchronized void run()
	{
        System.out.println("Hello world from Thread" + num);
    }
}