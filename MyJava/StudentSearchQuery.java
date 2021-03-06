import java.rmi.*; 
import java.rmi.server.*; 
import java.util.*; 
// A Class that represents use-defined expception 
class MyException extends Exception 
{
	public MyException(String s) 
	{ 
		// Call constructor of parent Exception 
		super(s); 
	} 
}
public class StudentSearchQuery extends UnicastRemoteObject implements College 
{ 
	int rollno; 
	String Name; 
	static int index = 0;
	StudentSearchQuery() throws RemoteException 
	{
		super(); 
	}
	StudentSearchQuery(int rollno, String Name) throws RemoteException 
	{ 
		this.rollno = rollno; 
		this.Name = Name; 
	}
	List<StudentSearchQuery> list = new ArrayList<>();
	public void Admit(int rollno, String Name) throws RemoteException 
	{ 
		list.add(index++, new StudentSearchQuery(rollno, Name)); 
		Display(); 
	}
	public void Display() throws RemoteException 
	{ 
		for (StudentSearchQuery s : list) 
			System.out.println("\n RollNo: " + s.rollno + "\n Name: " + s.Name); 
	}
	public String SearchRecord(int rollno) throws RemoteException 
	{ 
		for (StudentSearchQuery s : list) 
		{ 
			try 
			{
				if (s.rollno == rollno) 
				{ 
					System.out.println("RESULT FOUND"); 
					System.out.println("\n RollNo: " + s.rollno + "\n Name: " + s.Name);
					return s.Name; 
				} 
				else throw new MyException("NO DATA FOUND"); 
			} 
			catch (MyException e) 
			{ 
				System.out.println(e); return null; 
			} 
		} 
		return null; 
	} 
}