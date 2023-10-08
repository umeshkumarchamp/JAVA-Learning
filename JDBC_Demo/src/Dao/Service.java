package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.Connection.Dbconnect;

public class Service {

	public void method1(String tabName,int roll) {
	
		Connection c = Dbconnect.getConn(); 
		try {
			PreparedStatement psmt = c.prepareStatement("SELECT * FROM "+tabName+" where roll > ? ");
			 
			psmt.setInt(1, roll);
			
			ResultSet rs = psmt.executeQuery();
//			psmt.setInt(2, 108);
			System.out.println("Roll"+"\t"+"Name"+"\t\t"+"Age"+"\t"+"Email"+"\t\t"+"Phone");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
