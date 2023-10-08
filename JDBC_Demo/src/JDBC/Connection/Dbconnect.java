package JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
	
	static private String url = "jdbc:mysql://localhost:8080/mydb";
	static private String username = "root"; 
	static private String password = "root"; 

	
	public static Connection getConn(){
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return con;		
	}
	
}
