package app;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import model.College;
import model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration(); 
    	con.configure(); 
    	
//    	Session session = con.buildSessionFactory().openSession(); 
    	
//    	College clg = new College(23413,"Gossner College,","Ranchi"); 
//    	
//    	Student s1 = new Student(1, "Manoj", "MCA", (byte)2, clg); 
//    	Student s2 = new Student(2, "Rupesh", "BCA", (byte)3, clg); 
//
//    	session.save(s1); 
//    	session.save(s2); 
//    	session.beginTransaction().commit();
    	
    	
    	
    	
    	
    	System.out.println(con);
    	
        System.out.println( "Connected." );
    }
}
