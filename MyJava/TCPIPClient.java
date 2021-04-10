import java.net.*;
import java.io.*;

class TCPIPClient
{
    private Socket socket = null;
    private BufferedReader input = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public TCPIPClient(String address, int port)
	{
        try
		{
            socket = new Socket(address,port);
            System.out.println("Conncted with server");
            input = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
        }
		catch(Exception e)
		{
            System.out.println("Exception in TCPIPClient found "+e.getMessage());
        }

        String id = "";
        try
		{
            System.out.println("Enter employee id: ");
            id = input.readLine();
            out.writeUTF(id);
        }
		catch(Exception e)
		{
            System.out.println("Exception in TCPIPClient user read value "+e.getMessage());
        }

        String empInfo = "";
        try
		{
            empInfo = in.readUTF();
            System.out.println(empInfo);
        }
		catch(Exception e)
		{
            System.out.println("Exception found in TCPIPClient empinfo "+e.getMessage());
        }

        try
		{
            in.close();
            out.close();
            input.close();
            socket.close();
        }
		catch(Exception e)
		{
            System.out.println("Exception found in TCPIPClient closing "+e.getMessage());
        }
    }

    public static void main(String[] args)
	{
        TCPIPClient client = new TCPIPClient("localhost",5000);
    }
}