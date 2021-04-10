/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.sql.*;

/**
 *
 * @author HP
 */
public class Student1Db {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        // TODO code application logic here
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//HP//Sqlite//univ.db");
        PreparedStatement stm = con.prepareStatement("Select * from Students where deptno=?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department No. : ");
        int dno = sc.nextInt();
        stm.setInt(1,dno);
        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
             
        }
        stm.close();
        con.close();
    }
    
}
