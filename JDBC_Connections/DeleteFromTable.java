package JDBC_Connections;
import java.sql.*;
import java.io.*;


public class DeleteFromTable {
	
	DeleteFromTable() throws Exception{
	
		
		// STEPS
		// 1. Load or Register Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		
		// 2. Create connection
		String url = "jdbc:mysql://localhost/organization?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "akhilbitra";
		Connection con = DriverManager.getConnection(url,username,password);
		
		// 3. Create statement
		Statement st = con.createStatement();
		
		// 4. Execute query
		String query = "delete from employee where esal<50000";
		st.executeUpdate(query);
		System.out.println("Deleted successfully");
		
		// 5. Close connection
		con.close();
		
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new DeleteFromTable();
	}

}
