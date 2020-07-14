package JDBC_Connections;
import java.sql.*;
import java.io.*;

public class DatabaseMetaData {

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
				
				// 3. Get DBMetaData
				java.sql.DatabaseMetaData dbmd = con.getMetaData();
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDatabaseProductVersion());
				System.out.println(dbmd.getDriverName());
				System.out.println(dbmd.getURL());
				System.out.println(dbmd.getUserName());
				

	}

}
