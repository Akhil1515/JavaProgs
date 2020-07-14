package JDBC_Connections;
import java.io.*;
import java.sql.*;
import java.util.*;


public class PreparedStatementDemo {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number, name, salary");
		int no = sc.nextInt();
		String name = sc.next();
		int sal = sc.nextInt();
		
		// 1. Create or load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Create connection
		String url = "jdbc:mysql://localhost/organization?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "akhilbitra";
		Connection con = DriverManager.getConnection(url,username,password);
		
		
		// 3. Write query and create Prepared Statement
		String query = "insert into employee values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, no);
		ps.setString(2, name);
		ps.setInt(3, sal);
		ps.executeUpdate();
		System.out.println("Success in insertion");
		// 4. Close connection
		con.close();

	}

}
