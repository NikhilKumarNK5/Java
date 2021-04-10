import java.sql.*; 
import java.util.*; 

public class ContactInformation
{
	public static void searchInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the id to search for the particular contact: ");         
		int id = sc.nextInt(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//clg.db");             
			PreparedStatement pstm=con.prepareStatement("Select * from Contact where id=?"); 
            pstm.setInt(1,id); 
            ResultSet rs= pstm.executeQuery(); 
 
            System.out.println(" Id : "+rs.getInt(1) + "\n Name : " + rs.getString(2) + "\n Contact NO. : " + rs.getString(3)); 
 
            con.close(); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Invalid Input no such Contact exists"+e); 
        } 
    } 
	public static void showAll()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//clg.db");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from Contact");
			
			int id;
			String name;
			String contactno;
			while(rs.next())
			{
				id = rs.getInt("id");
				name = rs.getString("name");
				contactno = rs.getString("contact");
				System.out.println("Id : "+id+ " Name : "+name+ " Contact No. : "+contactno);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println("No Contact info"+e);
		}
	}
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in); 
         do  
	  	{ 
            System.out.println("Select your choice: "); 
            System.out.println(" 1. Search a contact by id : "); 
            System.out.println(" 2. View all Contacts : "); 
			System.out.println(" 3. Exit");
			System.out.println("Select your choice: ");
			int x = sc.nextInt(); 
			
			switch(x)
			{
				case 1: searchInDb();
						break;
				case 2: showAll();
						break;
				case 3: System.exit(0);
						
				default: System.out.println("Invalid Choice");
			}
		}while(true);
	}
}