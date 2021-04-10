import java.io.*;
import java.util.Scanner; 
public class J
{
    static boolean wrt = false, mutex = false; 
    static int readCount = 0;
    static int value = 0;
    public static void main(String[] args)
    {
        ab[] reader = new ab[10]; 
		bc[] writer = new bc[10]; 
		for (int a = 0; a < 10; a++)
        {
            reader[a] = new ab(); 
			writer[a] = new bc();
        }
        for (int a = 0; a < 10; a++)
        {
			writer[a].start();
			reader[a].start();
        }
    }
    static class bc extends Thread
    {
        @Override public void run()
        {
            // Waiting for previous writer 
            while (wrt)
            {
                System.out.print("");
            }

            // Locking Writer and Reader wrt = true;
            mutex = true;
            // Critical section
            BufferedWriter out = null; 
            try 
            {
				out = new BufferedWriter(new FileWriter("shared.txt", false)); 
				value = value + 1;
				System.out.println("Writing: " + (value)); 
				out.write(String.valueOf(value)); 
				out.close();
            }       
             catch (IOException e){}

    // Leaving Critical section
    wrt = false;
	mutex = false;
		}
	}
	static class ab extends Thread
	{
		@Override public void run()
		{

			// Waiting for other reader to unlock mutex
			while (mutex)
			{
				System.out.print("");
			}
			mutex = true; 
			readCount++;
			if (readCount == 1)
			{
			wrt = true; // Locking writer when reader is active
			}
			mutex = false;
			// Critical Section 
			try {
					File myObj = new File("shared.txt"); 
					Scanner myReader = new Scanner(myObj); 
					String data = myReader.nextLine(); 
					System.out.println("Reading: " + data); 
					myReader.close();
				} catch (FileNotFoundException e){}

			// Leave Critical section
			while (mutex) { System.out.print(""); } mutex = true;
			readCount--;
			if (readCount == 0) 
			{
				wrt = false; // Unlocking writer if all reading process is done.
			}
			mutex = false;
		}
	}
}
