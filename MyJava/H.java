import java.util.LinkedList; 
import java.util.Random; 
public class H
{
	static LinkedList<Integer> list = new LinkedList<>(); 
	static int cap = 5;
	static Random rand = new Random();
	public static void main(String[] args)
	{
		ProducerDriver producerDriver = new ProducerDriver(); 
		ConsumerDriver consumerDriver = new ConsumerDriver(); 
		producerDriver.start();
		consumerDriver.start();
	}
	static class ProducerDriver extends Thread
	{
		@Override public void run()
		{
			for(int a=0;a<10;a++)
			{
 
				// Producing a random integer 
				int value = rand.nextInt(100);
				// Waiting if shared queue is full 
				while (list.size() == cap)
				{
					System.out.print("");
				}
				// Producing Item
				System.out.println("Item Produced:" + value); 
				list.add(value);
			}
		}
	}
	static class ConsumerDriver extends Thread
	{
		@Override public void run()
		{
			for(int a=0;a<10;a++)
			{
				// Waiting if no item in Buffer 
				while (list.size() == 0)
				{
					System.out.print("");
				}
				// Consuming an  item 
				System.out.println("Consumed: " + list.removeFirst());
			}
		}
	}
}
