package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
//    	Configure to the database....
    	Configuration con = new Configuration(); 
    	con.configure(); 
    	
    	
    	con.addAnnotatedClass(Employee.class); 
     	System.out.println(con);
     	
     	SessionFactory sf = con.buildSessionFactory(); 
     	Session session = sf.openSession(); 
     	System.out.println(session);
     	
     	Transaction t = session.beginTransaction(); 
     	
     	Employee e1 = new Employee(102, "Aakash Kumar", "akash@gmail.com");
     	session.save(e1); 
     	t.commit();
     	
     	System.out.println("Data Inserted : \n"+e1.toString());
     	
    	
    }
}
