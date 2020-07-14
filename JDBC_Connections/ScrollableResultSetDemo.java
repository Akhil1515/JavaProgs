package JDBC_Connections;
import java.sql.*;
import java.io.*;



public class ScrollableResultSetDemo {

	public static void main(String[] args) {
		
		try {
		// STEPS
		// 1. Load or Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Create connection
		String url = "jdbc:mysql://localhost/organization?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "akhilbitra";
		Connection con = DriverManager.getConnection(url,username,password);
		
		// 3. Create statement 
		// SENSITIVE = updates in database will be reflected in result set, INSESNSITIVE = updates will not be reflected
		// UPDATABLE, READ_ONLY
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		// 4. Execute query
		ResultSet rs = st.executeQuery("select * from employee");
		
		
		
		// Get cursor position
		System.out.println("Cursor position: " + rs.getRow() + ", is Before First: " + rs.isBeforeFirst());
		
		rs.next();
		
		System.out.println("Cursor position: " + rs.getRow() + ", is First: " + rs.isFirst());
		
		rs.last();
		
		System.out.println("Cursor position: " + rs.getRow() + ", is Last: " + rs.isLast());
		
		rs.afterLast();
		
		System.out.println("Cursor position: " + rs.getRow() + ", is After First: " + rs.isAfterLast());
		
		
		// absolute positive moves cursor n from top
		rs.absolute(3);
		
		System.out.println("Cursor position: " + rs.getRow());
		
		// absolute negative moves cursor n from bottom
		rs.absolute(-4);
		
		System.out.println("Cursor position: " + rs.getRow());
		
		// relative positive moves cursor n below from present cursor position
		rs.relative(2);
		
		System.out.println("Cursor position: " + rs.getRow());
		
		// relative negative moves cursor n top from present cursor position
		rs.relative(-3);
				
		System.out.println("Cursor position: " + rs.getRow());
		
		
		
		// 5. Close connection
		con.close();
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
