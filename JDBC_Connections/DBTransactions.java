package JDBC_Connections;
import java.sql.*;


public class DBTransactions {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/organization?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "akhilbitra";
		Connection con = DriverManager.getConnection(url,username,password);
		
		con.setAutoCommit(false);
		
		String query = "update employee set esal = esal + 20";
		PreparedStatement ps = con.prepareStatement(query);
		ps.executeUpdate();
		System.out.println("Updated..");
		Savepoint s1 = con.setSavepoint();
		
		ps.executeUpdate();
		System.out.println("Updated..");
		Savepoint s2 = con.setSavepoint();
		ps.executeUpdate(); 
		System.out.println("Updated..");
		
		con.rollback(s1);
		System.out.println("Rollback successfull");
		con.commit();

	}

}
