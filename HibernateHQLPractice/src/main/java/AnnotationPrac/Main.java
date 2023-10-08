package AnnotationPrac;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration con = new Configuration(); 
		con.configure();
		
		SessionFactory factory = con.buildSessionFactory(); 
		
		Session session = factory.openSession(); 
		
		Transaction tr = session.beginTransaction(); 
		
		Course cs1 = new Course(183948, "MCA", (byte)2, 80000); 
		Course cs2 = new Course(812349, "MBA", (byte)3, 50000); 
		Course cs3 = new Course(234104,"M.Com",(byte)1,90000); 
		
		Set<Course> listOfCourse = new LinkedHashSet<>(); 
		Collections.addAll(listOfCourse, cs1,cs2); 
		
		Set<Course> listcollege2 = new LinkedHashSet<>(); 
		Collections.addAll(listcollege2,cs3); 
		
		College col1 = new College(1111, 839234, "Gossner College", "Ranchi Jharkhand", listOfCourse);
		College col2 = new College(2222, 982342, "Doranda College", "Doranda Ranchi", listcollege2);
		
//		College col1 = new College(); 
//		col1.setCollege_name("Gossner College");
//		col1.setCollege_address("Ranchi Jharkhand");
//		col1.setCollege_registration(234134134l);
//		col1.setCourse(listOfCourse);
//		
//		College col2 = new College(); 
//		col2.setCollege_name("Doranda College");
//		col2.setCollege_address("Ranchi Jharkhand");
//		col2.setCollege_registration(234134134l);
//		col2.setCourse(listOfCourse);
		
		session.save(cs1); 
		session.save(cs2); 
		session.save(cs3); 
		session.save(col1); 
		session.save(col2); 
		
//		Student std1 = new Student(); 
//		std1.setName("Umesh Kumar");
//		std1.setAge(23);
//		std1.setAddress("Ashok Nagar");
//		std1.setCollege(col1);
//		std1.setCourse(cs3);
//		session.save(std1); 
//		
//		Student std2 = new Student(); 
//		std2.setName("Champ Kumar");
//		std2.setAge(25);
//		std2.setAddress("Argora");
//		std2.setCollege(col2);
//		std2.setCourse(cs2);
//		session.save(std2); 
		 
		tr.commit();
		
		
		
		System.out.println(con);
		System.out.println("Congralutations!!!!!");
	}

}
