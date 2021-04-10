import java.sql.*; 
import java.util.*; 

public class ContactInfoDB
{
	public static void addInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Contact Details: Id, Name and Contact No. ");        
		int id=sc.nextInt();         
		String name=sc.next(); 
        String contact=sc.next(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//clg.db");             
			PreparedStatement pstm=con.prepareStatement("Insert into Contacts values(?,?,?)");             
			pstm.setInt(1,id);             
			pstm.setString(2,name);            
			pstm.setString(3,contact);             
			pstm.executeUpdate(); 
            con.close(); 
            System.out.println("!!! Record Saved !!!"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e); 
            System.exit(0); 
        } 
} 
	public static void showAll()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//clg.db");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from Contacts");
			
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
            System.out.println(" 1. Insert a new Contact : "); 
            System.out.println(" 2. View all Contacts : "); 
			System.out.println(" 3. Exit");
			System.out.println("Select your choice: ");
			int x = sc.nextInt(); 
			
			switch(x)
			{
				case 1: addInDb();
						break;
				case 2: showAll();
						break;
				case 3: System.exit(0);
						
				default: System.out.println("Invalid Choice");
			}
		}while(true);
	}
}