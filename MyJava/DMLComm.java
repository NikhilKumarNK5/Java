import java.util.*;
import java.sql.*;

public class DMLComm 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//HP//Sqlite//univ.db");
        //Statement stm = con.createStatement();
		//stm.executeUpdate("Insert into dept values(60,'Aero')");
		//stm.executeUpdate("Delete from dept where deptno>50");
		//stm.executeUpdate("Update dept set dname = 'CS' where deptno = 50");
		
		
		//insert using prepared statement
		
		PreparedStatement pstm = con.prepareStatement("Insert into Students values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student data : ");
		System.out.println("Enter Roll no : ");
		int rno = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter Dept NO. : ");
		int deptno = sc.nextInt();
		
		pstm.setInt(1,rno);
		pstm.setString(2,name);
		pstm.setString(3,city);
		pstm.setInt(4,deptno);
        
		pstm.executeUpdate(); 
		
		pstm.close();
		con.close();
		
    }
    
}
