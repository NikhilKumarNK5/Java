import java.rmi.*; 
import java.util.*; 
public class ClientRequest 
{
	public static void main(String args[]) 
	{ 
		String answer, value = "Reflection in Java"; 
		try 
		{ 
			// lookup method to find reference of remote object 
			College access = (College) Naming.lookup("rmi://localhost:1900" + "/NikhilRemote"); 
			String rollno; 
			String Name; 
			int choice; 
			Scanner in = new Scanner(System.in); 
			System.out.println("\n 1.Enter Details");  
			System.out.println(" 2.Search Record");
			System.out.println(" 3.Quit!!"); 
			choice = in.nextInt();
			
 				switch (choice) 
				{
					case 1: 
							in.nextLine(); 
							System.out.print("Enter Roll No: "); 
							rollno = in.nextLine();
							if (rollno.equals("exit")) 
								break; 
								System.out.print("Enter Name: ");
								Name = in.nextLine(); 
								access.Admit(Integer.parseInt(rollno), Name); 
								break;
					case 2:
							in.nextLine(); 
							System.out.print("Enter Roll No: "); 
							rollno = in.nextLine();
							Name = access.SearchRecord(Integer.parseInt(rollno));
							if (Name != null) 
							System.out.println("Name: " + Name);
							break;
					case 3: 
							in.nextLine();
							System.exit(0);
							break;
					
					default: System.out.println("Wrong Input");
				}
			
			
		} 
		catch (Exception ae) 
		{ 
			System.out.println(ae);
		}
	}
}