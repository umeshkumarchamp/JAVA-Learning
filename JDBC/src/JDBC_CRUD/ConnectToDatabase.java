package JDBC_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {

	private static String url = "jdbc:mysql://localhost:8080/crud"; 
	private static String username = "root"; 
	private static String password = "root"; 
	
	public static Connection getConn() throws SQLException {
		
		Connection con = DriverManager.getConnection(url,username,password); 
		
		return con; 
	}
	
}
