package JDBC_Connections;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SelectFromTable {
	
	SelectFromTable() throws Exception{
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
				String query = "select * from employee";
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}
				// 5. Close connection
				con.close();
	}

	public static void main(String[] args) throws Exception{
		new SelectFromTable();

	}

}
