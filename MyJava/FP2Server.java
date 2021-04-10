import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

class FP2Server
{

    public static void main(String[] args) throws IOException 
	{
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];
        DatagramPacket receivedPacket = new DatagramPacket(receive, receive.length);
        ds.receive(receivedPacket);
        String format = data(receive).toString();
        System.out.println("Date format received : " + format);
        String formattedDate = formatDate(new Date(), format);
        InetAddress address = receivedPacket.getAddress();
        int port = receivedPacket.getPort();
        byte buf[] = formattedDate.getBytes();
        System.out.println("Sending formatted date.. ");

        DatagramPacket DpSend = new DatagramPacket(buf, buf.length, address, port);
        ds.send(DpSend);
        ds.close();
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

    private static String formatDate(Date date, String format) 
	{
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try 
		{
            return dateFormat.format(date);
        }
		catch (Exception e)
		{
            return date.toString();
        }
    }
}