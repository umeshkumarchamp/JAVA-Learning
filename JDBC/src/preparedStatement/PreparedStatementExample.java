package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:8080/library"; 
		String username = "root"; 
		String password = "root"; 
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			
//			String query = "DROP DATABASE library1";
			//String query = "create table book (book_id int primary key, book_name varchar(20), author varchar(20), price int )";
			
			String query = "INSERT INTO book values(?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, 100);
			pstmt.setString(2, "JAVA");
			pstmt.setString(3, "Ramlal");
			pstmt.setInt(4, 3000);
			
			if(!pstmt.execute()) {
				System.out.println("Inserted.");
			}else {
				System.out.println("Failed.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		

	}

}
