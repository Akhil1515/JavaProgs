package JDBC_Connections;
import java.sql.*;
import java.io.*;


public class RSMetaData {

	public static void main(String[] args) throws Exception{
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
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		System.out.println("No. of colums: " + count);
		for(int i=1;i<=count;i++) {
			System.out.print(rsmd.getColumnName(i) + " ");
			System.out.print(rsmd.getColumnTypeName(i) + " ");
			System.out.print(rsmd.getColumnDisplaySize(i) + " ");
			System.out.println();
		}
	}

}
