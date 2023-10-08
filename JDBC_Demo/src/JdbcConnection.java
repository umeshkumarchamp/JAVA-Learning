
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dao.Service;
//import JdbcConnection.*;
import JDBC.Connection.Dbconnect;

public class JdbcConnection {

//	static Connection con = null; 
//	static Statement statement = null;
//	static PreparedStatement pstatement = null;
	public static void main(String[] args) {
		
		// first step (Optional)
		// Class.forName(); 
		
		
		try(Connection con = Dbconnect.getConn())
		{
			
			Service s = new Service(); 
			s.method1("student",104);
			//s.method1();
			
//			con = Dbconnect.getConn(); 
			
//			secon step (mandatory)
			//con = DriverManager.getConnection("jdbc:mysql://localhost:8080/mydb","root","root");

			// Third step
			//statement = con.createStatement();
//			pstatement = con.prepareStatement("SELECT * FROM student where roll > ? and roll < ?");
//			pstatement.setInt(1, 103);
//			pstatement.setInt(2, 108);

			//String query = "INSERT INTO student1(rollNumbers, names) values (3,'Manish')";
			//String query = "SELECT * FROM student where roll > 105"; 
			//boolean status = statement.execute(query);
			//ResultSet rs = statement.executeQuery(query);
			//ResultSet rs = pstatement.executeQuery();
			//System.out.println("Roll"+"\t"+"Names");
//			System.out.println("Roll"+"\t"+"Names"+"\t\t"+"Age"+"\t"+"Email"+"\t\t"+"Phone");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
//				System.out.println(rs.getInt("rollNumbers")+"\t"+ rs.getString("names"));
//			}
			
//			if(!status) {
//				System.out.println("Record Added.");
//			}else {
//				System.out.println("Record not Added.");
//			}
//			
			
//			fourth step 
//			con.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block"
			e.printStackTrace();
		}
//		finally {
//			try {
//				if(pstatement != null) {
//					con.close();
//					pstatement.close();
//				}
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
	
}
