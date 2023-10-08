package app;

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
//    	1. Configure 
    	Configuration config = new Configuration(); 
    	config.configure(); 
    	System.out.println(config);
    	
//    	2. SessionFActory interface 
    	SessionFactory sf = config.buildSessionFactory(); 
    	
//    	3. Session Interface
    	Session session = sf.openSession(); 
    	
//    	4. Transaction interface 
    	Transaction tr = session.beginTransaction(); 
    	
    	Employee emp1 = new Employee(); 
    	emp1.setEmp_name("Umesh Kumar");
    	emp1.setEmail("umesh@gmail.com");
    	emp1.setPhone(6201033951l);
    	
    	session.save(emp1); 
    	tr.commit();
    	
    	
    	
        System.out.println( "Connected." );
    }
}
