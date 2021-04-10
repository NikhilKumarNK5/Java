import java.rmi.*;
public interface College extends Remote
{
	public void Admit(int rollno, String Name) throws RemoteException;
	public String SearchRecord(int rollno) throws RemoteException;
	public void Display() throws RemoteException;
}