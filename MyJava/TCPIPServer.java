import java.net.*;
import java.io.*;

class Employee
{
    private String EmpName;
    private int EmpId;
    private String EmpDept;

    public Employee(String EmpName, int EmpId, String EmpDept)
	{
        this.EmpName = EmpName;
        this.EmpId = EmpId;
        this.EmpDept = EmpDept;
    }

    public String getEmpName()
	{
        return this.EmpName;
    }

    public int getEmpId()
	{
        return this.EmpId;
    }

    public String getEmpDept()
	{
        return this.EmpDept;
    }
}

class TCPIPServer 
{
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public TCPIPServer(int port) 
	{
        String id = "";
        int i = 0;
        try 
		{
            Employee[] empObj = new Employee[3];
            empObj[0] = new Employee("Shakti", 1, "Finance");
            empObj[1] = new Employee("Kartik", 2, "Marketing");
            empObj[2] = new Employee("Shivani", 3, "HR");

            ServerSocket acc = new ServerSocket(port);
            System.out.println("Server started");
            Socket s = acc.accept();
            System.out.println("Client is now connected");

            in = new DataInputStream(new BufferedInputStream(s.getInputStream()));
            out = new DataOutputStream(s.getOutputStream());
            id = in.readUTF();
            i = Integer.parseInt(id);
            for (int j = 0; j < empObj.length; j++) 
			{
                if (empObj[j].getEmpId() == i) 
				{
                    int ids = empObj[j].getEmpId();
                    String empId = Integer.toString(ids);
                    String empName = empObj[j].getEmpName();
                    String empDept = empObj[j].getEmpDept();
                    String empInfo = "Emp Id = " + empId + "\n" + "Emp Name = " + empName + "\n" + "Emp Department = " + empDept;
                    out.writeUTF(empInfo);
                    break;
                }
            }
            in.close();
            out.close();
            socket.close();
        } 
		catch (Exception e) 
		{
            System.out.println("Exception found in TCPIPServer constructor " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        TCPIPServer server = new TCPIPServer(5000);
    }
}