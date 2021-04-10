import java.sql.*; 
import java.util.*; 
 
 
public class StudDB  
{ 
 
    public static void addInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Student Details: Id, Name and Course ");        
		int id=sc.nextInt();         
		String name=sc.next(); 
        String course=sc.next(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//myclg.db");             
			PreparedStatement pstm=con.prepareStatement("Insert into Students values(?,?,?)");             
			pstm.setInt(1,id);             
			pstm.setString(2,name);            
			pstm.setString(3,course);             
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
 
    public static void deleteInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Student id to delete");         
		int id=sc.nextInt(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//myclg.db");             
			PreparedStatement pstm=con.prepareStatement("Delete from Students where id=?"); 
            pstm.setInt(1,id);             
			pstm.executeUpdate(); 
            con.close(); 
            System.out.println("!!! Record Deleted !!!"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e); 
            System.exit(0); 
        } 
    } 
 
    public static void updateInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Student id to to update its Data:");         
		int id=sc.nextInt(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//myclg.db"); 
            System.out.println("Select the choice: "); 
            System.out.println(" 1. Update Name -");             
			System.out.println(" 2. Update Course -");
			System.out.println("Enter your choice: ");
            int choice=sc.nextInt();             
			switch (choice) 
            { 
                case 1: String nm=sc.next(); 
 
                        PreparedStatement pstm=con.prepareStatement("Update Students set name=? where id=?"); 
                        pstm.setInt(2,id);                         
						pstm.setString(1,nm);                        
						pstm.executeUpdate(); 
                        con.close(); 
                        System.out.println("!!! RECORD UPDATED (Name) !!!");                        
						break; 
 
                case 2: String crs=sc.next(); 
                    PreparedStatement pstm2=con.prepareStatement("Update Students set course=? where id=?");                     
					pstm2.setInt(2,id);                     
					pstm2.setString(1,crs);                     
					pstm2.executeUpdate(); 
                    con.close(); 
                    System.out.println("!!! RECORD UPDATED (course) !!!");                     
					break; 
                default: 
                    System.out.println("Enter Valid Choice!!!");                     
					break; 
 
            } 
        } 
        catch (Exception e) 
        { 
            System.out.println(e); 
            System.exit(0); 
        } 
    } 
 
    public static void searchInDb() 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Student id to get the the Student Detail:");         
		int id=sc.nextInt(); 
        try  
	  	{ 
            Class.forName("org.sqlite.JDBC"); 
            Connection con=DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//myclg.db");             
			PreparedStatement pstm=con.prepareStatement("Select * from Students where id=?"); 
            pstm.setInt(1,id); 
            ResultSet rs= pstm.executeQuery(); 
 
            System.out.println(" Id: "+rs.getInt(1) + "\n Name: " + rs.getString(2) + "\n Course: " + rs.getString(3)); 
 
            con.close(); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Invalid Input no such Student found"+e); 
        } 
    } 
 
    public static void main(String[] args) throws Exception 
	{ 
         
        Scanner sc=new Scanner(System.in); 
         do  
	  	{ 
            System.out.println("Select your choice: "); 
            System.out.println(" 1. Add new Student"); 
            System.out.println(" 2. Delete Student"); 
            System.out.println(" 3. Update Existing Student"); 
            System.out.println(" 4. Search for Existing Student and Display its Details"); 
			System.out.println(" 5. Exit");
			System.out.println("Enter your choice");
            int x = sc.nextInt(); 
 
            switch (x)  
	  	 	{ 
                case 1: addInDb();                 
						break; 
                case 2: deleteInDb();                 
						break; 
                case 3: updateInDb();                 
						break; 
                case 4: searchInDb();                 
						break;                 
					case 5: System.exit(0);                
				default: 
						System.out.println("Invalid input");                    
						break; 
            } 
        }while (true); 
    } 
}
