package JDBC_CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {


//	Method for creating a new database.......
	public static void createDatabase() {
		
		String query = "CREATE DATABASE crud";
		Statement stmt = null; 
		
		try(Connection c = ConnectToDatabase.getConn()){
		
			stmt = c.createStatement(); 
			
			boolean status = stmt.execute(query); 
			
			if(!status) {
				System.out.println("Database Created Successfully.");
			}else {
				System.out.println("Something went Wrong...");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Method for creating table....
	public static void createTable() {
		
		String query = "CREATE TABLE book (book_id int primary key auto_increment, b_name varchar(20), b_author varchar(20), b_price int)"; 
		PreparedStatement pstmt = null;  
		try(Connection con = ConnectToDatabase.getConn()){
			
			pstmt = con.prepareStatement(query); 
			boolean status = pstmt.execute(); 
			if(!status) {
				System.out.println("Table Created Successfully.");
			}else {
				System.out.println("Something went wrong.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

//	Method for insert into record..
	public static void insertRecord(int b_id, String b_name, String b_author, int b_price) {
		String query = "INSERT INTO book values(?,?,?,?)"; 
		PreparedStatement pstmt = null; 
		try(Connection con = ConnectToDatabase.getConn()){
			
			pstmt = con.prepareStatement(query); 
			pstmt.setInt(1, b_id); 
			pstmt.setString(2, b_name);
			pstmt.setString(3, b_author);
			pstmt.setInt(4, b_price);
			boolean status = pstmt.execute(); 
			if(!status) {
				System.out.println("Record Inserted Successfully.");
			}else {
				System.out.println("Something went wrong.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
	}

//	Method for updating record..
	public static void updateRecord(int b_id,String b_name, String b_author, int b_price) {
		PreparedStatement pstmt = null; 
		final String query = "UPDATE book set b_name = ? , b_author = ?, b_price = ? where book_id = ?";
		
		try(Connection con = ConnectToDatabase.getConn()){

			pstmt = con.prepareStatement(query); 
			pstmt.setString(1,b_name);
			pstmt.setString(2, b_author);
			pstmt.setInt(3, b_price);
			pstmt.setInt(4, b_id);
			
			int result = pstmt.executeUpdate();
			if(result >=1) {
				System.out.println("Record Updated Successfully.");
			}else {
				System.out.println("Something went wrong.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	Method for deleting record from database.
	public static void deleteRecord(int book_id) {
		final String query = "DELETE from book where book_id = ?";
		
		try(Connection con = ConnectToDatabase.getConn(); PreparedStatement pstmt = con.prepareStatement(query)){
			
			pstmt.setInt(1, book_id);
			
			int result = pstmt.executeUpdate();
			if(result>=1) {
				System.out.println("Record Deleted Successfully.");
			}else {
				System.out.println("Somethig went wrong.");
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

//	Method for retrieve data from database.
	public static void searchRecordById(int b_id) {
		final String query = "SELECT * FROM book where book_id = ?"; 
		try(Connection con = ConnectToDatabase.getConn(); PreparedStatement pstmt = con.prepareStatement(query)){

			pstmt.setInt(1, b_id);
			ResultSet rs = pstmt.executeQuery(); 
			if(rs.next()) {
				System.out.println("Book Id : "+rs.getInt(1)+"\n"+"Book Name : "+rs.getString(2)+"\n"+"Book Author : "+rs.getString(3)+"\n"+"Book Price : "+rs.getInt(4));
			}else {
				System.out.println("Not Data Found of Id : "+b_id);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	Method for show all Record.
	public static void showAllRecord() {
		String query = "SELECT * FROM book"; 
		try(Connection c = ConnectToDatabase.getConn(); PreparedStatement pstmt = c.prepareStatement(query)){
			
			System.out.println("Book Id"+"\t\t"+"Book Name"+"\t\t"+"Author Name"+"\t\t"+"Book Price");
			ResultSet rs = pstmt.executeQuery(); 
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t"+rs.getString(3)+"\t\t"+rs.getInt(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
