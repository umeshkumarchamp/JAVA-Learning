package app;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Account.Aadhar;
import Account.Person;
import model.Course;
import model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration().configure(); 
    	
    	Session session = config.buildSessionFactory().openSession(); 
    	
//    	Course c1 = new Course(101,"JAVA", (byte)6, 30000); 
//    	Course c2 = new Course(102,"AWS", (byte)3, 18000); 
    	
    	Course c1 = new Course(101,"C/C++", (byte)6, 23000); 
    	Course c2 = new Course(102,"PYthon", (byte)3, 18000);
    	Course c3 = new Course(103,"SQL", (byte)5, 8000);

    	Set<Course> listOfCourse = new LinkedHashSet<Course>(); 
//    	listOfCourse.add(c1); 
//    	listOfCourse.add(c2); 
    	Collections.addAll(listOfCourse, c1,c2,c3); 
    	
    	Student st1 = new Student();
    	st1.setName("Champ Kumar");
    	st1.setDOA(new Date());
    	st1.setCourse(listOfCourse);
    	
    	Student st2 = new Student();
    	st2.setName("Umesh Kumar");
    	st2.setDOA(new Date());
    	st2.setCourse(listOfCourse);
    	
    	Student st3 = new Student();
    	st3.setName("Manish Kumar");
    	st3.setDOA(new Date());
    	st3.setCourse(listOfCourse);
    	
//    	Student st2 = new Student();
//    	st2.setName("Umesh Kumar");
//    	st2.setDOA(new Date());
//    	st2.setCourse(listOfCourse);
    	
    	session.save(c1); 
    	session.save(c2); 
    	session.save(c3); 
    	session.save(st1);
    	session.save(st2);
    	session.save(st3); 
    	session.beginTransaction().commit();
    	
//    	Student stu = session.get(Student.class,2 ); 
//    	System.out.println(stu);
    	
    	
    	
//    	Aadhar a1 = new Aadhar(101, 989100991171l, "Umesh Kumar Mahto", "Company 1");
//    	
//    	Person p1 = new Person(); 
//    	p1.setName("Umesh");
//    	p1.setAadhar(a1);
//    	p1.setAge(23);
//
//    	session.save(a1); 
//    	session.save(p1); 
//    	session.beginTransaction().commit();
    	
//    	Person ob = session.get(Person.class, 2);
//    	
//    	System.out.println(ob);
    	
    	
        System.out.println( "Connected." );
        
        session.close();
    }
}
