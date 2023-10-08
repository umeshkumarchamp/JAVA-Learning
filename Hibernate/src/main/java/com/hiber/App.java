package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	// config class
    	Configuration config = new Configuration();
    	config.configure();
    	
    	// mapping
//    	config.addAnnotatedClass(Laptops.class);
    	config.addAnnotatedClass(Employee.class); 
    	
    	// SessionFactory interface
    	SessionFactory sf = config.buildSessionFactory(); 
    	
    	// SessionInterface
    	Session session = sf.openSession();     	
    	
    	// Transaction Interface
    	Transaction tr = session.beginTransaction(); 
    	
//    	Employee umesh = new Employee(104,"monu@gmail.com","Mohan Kumar"); 
//    	ram.setEmp_id(103);
//    	ram.setEmp_email("ram@gmail.com");
//    	ram.setEmp_name("Ram Kumar");
    	
//    	Laptops del = new Laptops(78341, "Black", "DELL", "18 Inches");
//    	Laptops hp = new Laptops(87243, "Black", "HP", "19 Inches");
//    	Laptops asus = new Laptops(68341, "Gray", "ASUS", "15 Inches");
//    	Laptops apple = new Laptops(98872, "White", "Apple", "20 Inches");
//    	Laptops lenovo = new Laptops(91843, "Black", "Lenovo", "17 Inches");
//    	
//    	session.save(del);
//    	session.save(hp);
//    	session.save(asus);
//    	session.save(apple);
//    	session.save(lenovo);
    	
    	
//    	session.save(ram);
//    	session.save(umesh);
//    	tr.commit(); 
    	
//    	Laptops laptops = session.get(Laptops.class, 78341);    	
//    	laptops.toString();
    	
    	
    	
    	Employee emp = session.get(Employee.class, 102);
    	System.out.println("Name : "+emp.getEmployee_name());
    	
    	Employee e2 = session.get(Employee.class, 103); 
    	e2.setEmployee_email("manish@gmail.com");
    	e2.setEmployee_name("Manish Rana");
    	session.save(e2); 
    	tr.commit();
//    	session.delete(emp);
//    	tr.commit();
    	
    	
        System.out.println( "Configuration Done" );
    }
}
