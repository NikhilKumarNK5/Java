import java.rmi.*; 
import java.rmi.registry.*; 
public class SearchServer 
{ 
	public static void main(String args[]) 
	{ 
		try 
		{ 
			College obj = new StudentSearchQuery(); 
			LocateRegistry.createRegistry(1900); 
			Naming.rebind("rmi://localhost:1900" + "/NikhilRemote", obj); 
		} 
		catch (Exception ae) 
		{ 
			System.out.println(ae); 
		} 
	}	
}