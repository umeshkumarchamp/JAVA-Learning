package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class App 
{
    public static void main( String[] args ) throws ParseException, IOException
    {
    	
//    	1. Create object of configuration class

    	Configuration config = new Configuration(); 
    	config.configure(); 
    	
//    	2. Getting object of sessionfactory interface
    	SessionFactory sf = config.buildSessionFactory(); 
    	
    	
    	
    	
//    	3. Getting object of Session Interface
    	Session session = sf.openSession(); 
    	
    	
    	
    	
//    	4. Getting Transation interface object
    	Transaction tr = session.beginTransaction(); 
//    	System.out.println(config);
//    	Employee emp = new Employee();
//    	emp.setEmp_id(101);
//    	emp.setEmp_name("Gautam");
//    	emp.setSalary(54000);
    	
//    	session.save(emp); 
    	
    	System.out.println(config);
    	
//    	5. Creating object of student class
//    	String date = "2020-03-20"; 
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    	Date d = format.parse("2019-07-21");
    	
    	FileInputStream fis = new FileInputStream("src/main/java/about.jpg"); 
    	byte [] photo = new byte[ fis.available()];
    	fis.read(photo);
    	Student std1 = new Student(); 
    	std1.setStd_name("Shubham Kumar");
    	std1.setDOA(new Date());
//    	std1.setDOA(d);
    	std1.setStd_address("TATA");
    	std1.setStd_number("7482849381");
    	std1.setImage(photo); 
    	session.save(std1); 
    	
    	
    	tr.commit();
    	
    	
//    	sf.close();
    	
        System.out.println("Successful." );
    }
}
