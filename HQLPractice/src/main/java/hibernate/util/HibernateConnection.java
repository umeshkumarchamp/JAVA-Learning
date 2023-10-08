package hibernate.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {

	public static Session Connect() {
		Configuration con = new Configuration().configure(); 
		Session session = con.buildSessionFactory().openSession(); 
		return session; 
		
	}
	
}
