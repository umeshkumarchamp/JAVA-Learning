package app;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Bank.Account;
import Bank.Customer;
import model.Course;
import model.Student;

public class Main {

	public static void main(String[] args) {
		
		
//		1. Configure karna 
		Configuration config = new Configuration().configure(); 
		
//		2. SessFactory build karna
		Session session = config.buildSessionFactory().openSession(); 

//		Account a1 = new Account(9939248345l, "PNB", "Umesh Mahto"); 
//		Account a2 = new Account(9983482984l, "ICICI Bank", "Manish Rana"); 
//		Account a3 = new Account(9934989429l,"HDFC Bank","Sweta Verma"); 
		
//		session.save(a1); 
//		session.save(a2); 
//		session.save(a3); 
//		
//		Customer c1 = new Customer(); 
//		c1.setName("Umesh");
//		c1.setAge(23);
//		c1.setPhone(6201033951l);
//		c1.setAccount(a1);
//		
//		Customer c2 = new Customer(); 
//		c2.setName("Manish");
//		c2.setAge(24);
//		c2.setPhone(993948827l);
//		c2.setAccount(a2);
//		
//		Customer c3 = new Customer(); 
//		c3.setName("Sweta");
//		c3.setAge(24);
//		c3.setPhone(783499824l);
//		c3.setAccount(a3);
//		
//		session.save(c1);
//		session.save(c2); 
//		session.save(c3);

		
//		OneToMany 
		
		Course c1 = new Course(4381, "Java", 6, 7000); 
		Course c2 = new Course(8234, "C/C++", 7, 8000);
		Course c3 = new Course(9234, "Web", 4, 5000);
		Course c4 = new Course(1234, "PYthon", 2, 3000);
		Course c5 = new Course(7392, "PHP", 8, 9000);
		
		Set<Course> courseOfSt1 = new LinkedHashSet<>(); 
		Collections.addAll(courseOfSt1, c1,c2); 
		
		Set<Course> courseOfSt2 = new LinkedHashSet<>(); 
		Collections.addAll(courseOfSt2, c3,c4,c5); 
		
		Student st1 = new Student(); 
		st1.setName("Umesh Kumar"); 
		st1.setCourse(courseOfSt1); 
		
		Student st2 = new Student(); 
		st2.setName("Champ Kumar"); 
		st2.setCourse(courseOfSt2); 
		
		session.save(c1); 
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		
		session.save(st1); 
		session.save(st2); 
		
//		3. Transaction karna
		
		session.beginTransaction().commit();
		
		
		
		
		System.out.println("Connected."); 

		session.close();
	}

}
