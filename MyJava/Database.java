import java.sql.*;
class Database
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite:c://Users//HP//Sqlite//univ.db");
		Statement stm = con.createStatement();//this will create select statement
		ResultSet rs = stm.executeQuery("Select * from dept");
		int dno;
		String dname;
		while(rs.next())
		{
			dno = rs.getInt("deptno");
			dname = rs.getString("dname");
			System.out.println(dno+ "  "+dname);
		}
	}
}