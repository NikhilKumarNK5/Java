import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

class FP2Client
{

    public static void main(String args[]) throws IOException 
	{
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
        System.out.print("Enter the format for date : ");
        String inp = sc.nextLine();
        buf = inp.getBytes();
        System.out.println("Sending date format.. ");
        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
        ds.send(DpSend);
        byte[] receive = new byte[65535];
        DatagramPacket DpReceive = new DatagramPacket(receive, receive.length);
        ds.receive(DpReceive);
        System.out.println("Formatted date received : " + data(receive));
        ds.close();
        sc.close();
    }

    public static StringBuilder data(byte[] a) 
	{
        if (a == null) 
		{
            return null;
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        while (a[i] != 0) 
		{
            ret.append((char) a[i]);
            i++;
        }
        return ret;
    }
}