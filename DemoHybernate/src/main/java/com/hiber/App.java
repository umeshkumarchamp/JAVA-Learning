package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		Configuration con = new Configuration();
		con.configure();
//		con.addAnnotatedClass(Employee.class); 
		con.addAnnotatedClass(Student.class); 
//    	System.out.println(con);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
//		System.out.println(session);
		Transaction t = session.beginTransaction(); 
//		Employee e1 = new Employee(4,"Manish");
		Student s1 = new Student(101, "Umesh Kumar", "MCA", "Ashok Nagar", 6201033);
		session.save(s1); 
		t.commit();
//		System.out.println("\nData Insert : \n"+"Employee id : "+e1.getEmp_id()
//		+"\nEmployee Name : "+e1.getEmp_name());

		System.out.println("\nRecord Inserted : \n"+s1.toString());
		
	}
}
