package JDBC_Connections;
import java.sql.*;


public class UpdateTable {
	
	UpdateTable(){
		try {
			
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
			String query = "update employee set esal=40000 where eno=104";
			st.executeUpdate(query);
			System.out.println("Updated succesfully");
			
			// 5. Close connection
			con.close();
			
			
		}
		catch(Exception e) {
			System.out.println("Caught...");
		}
	}

	public static void main(String[] args) {
		new UpdateTable();

	}

}
