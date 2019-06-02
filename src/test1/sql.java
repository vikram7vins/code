package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class sql {

	public static void main(String[] args) throws Exception 
	{
	Class.forName("com.mysql.jdbc.Driver");
	
	System.out.println("Driver loaded");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sindu", "root", "password");
	System.out.println("connected to mysql ");
	System.out.println();
	
	
	 Statement smt=con.createStatement();
	 
	 ResultSet rs = smt.executeQuery("select* qedge");
	 
	 while(rs.next())
	 {
		 int iden = rs.getInt("id");
			System.out.print(iden);
			System.out.print("   ");
			
		 String printn = rs.getString("name");
		 System.out.print(printn);
		 System.out.print("   ");
		 
		String cr = rs.getString("course");
		System.out.print(cr);
		System.out.println("  ");
		
		
	 }
	 

	}

}
