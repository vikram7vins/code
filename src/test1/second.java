package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class second {

	public static void main(String[] args) throws Exception, IllegalAccessException, Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		String dburl,uid,pwd,sqlquery;
		
		dburl="jdbc:mysql://qedgetech.com:3306/orangehrm2019";
		uid="qedgehrm";
		pwd="12345";
		
		sqlquery="Select max(emp_number) from hs_hr_employee";
		
		Connection dbcon;
		dbcon=DriverManager.getConnection("jdbc:mysql://qedgetech.com:3306/orangehrm2019", "qedgehrm", "12345");
		
	//Step 2: Send SQL Query to Database	
	
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("Select max(emp_number) from hs_hr_employee");	
		
		
	// Step 3: Process Results		
		rs.next();
		int maxempno=rs.getInt(1);
		System.out.println(maxempno);
	
		rs.close();
		dbcon.close();



	}

}
