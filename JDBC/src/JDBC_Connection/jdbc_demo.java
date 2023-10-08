package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo {

	public static void main(String[] args) {
		
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/jdbcDB","root","root");
			Statement statement = con.createStatement(); 
			
			//String query = "CREATE TABLE emp (emp_id int primary key auto_increment, emp_name varchar(20), d_id varchar(5), m_id varchar(5), foreign key(d_id) references dept(d_id), foreign key(m_id) references manager(m_id))";
			//String query = "INSERT INTO emp (emp_name,d_id,m_id) values('Manish Kumar','d4','m1'),('Sweta Kumari','d2','m2'),('Aakash Kumar','d1','m3')";
			String query = "SELECT e.emp_id, e.emp_name, d.d_name, m.m_name from emp e join dept d on e.d_id = d.d_id join manager m on e.m_id = m.m_id order by e.emp_id;"; 
			//boolean status = statement.execute(query);
			ResultSet rs = statement.executeQuery(query);
			System.out.println("Employee"+"\t"+"Employee Name "+"\t\t"+"Department"+"\t"+"Manager");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			}
			
			
//			if(!status) {
//				System.out.println("Successfull.");
//			}else {
//				System.out.println("Failed.");
//			}
			
			
			//System.out.println(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
	
}
