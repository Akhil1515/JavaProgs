package JDBC_Connections;
import java.sql.*;


public class CreateTable {
	
	CreateTable(){
		try {
			
			// STEPS:
			// 1. Load or Register Driver Manager
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			
			// 2. Create connection
			String url = "jdbc:mysql://localhost/organization?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username = "root";
			String password = "akhilbitra";
			Connection con = DriverManager.getConnection(url,username,password);
			
			// 3. Create statement or prepared statement
			Statement st = con.createStatement();
			
			// 4. Execute the query
			String query = "create table employee(eno int, ename varchar(15), esal int)";
			st.executeUpdate(query);
			System.out.println("Created Table");
			
			
			// 5. Close the connection
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CreateTable();

	}

}
