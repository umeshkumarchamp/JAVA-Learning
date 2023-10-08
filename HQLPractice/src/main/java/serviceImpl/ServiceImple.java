package serviceImpl;

import java.util.Date;

import org.hibernate.Session;

import hibernate.util.HibernateConnection;
import model.Student;
import service.Service; 

public class ServiceImple implements Service {

	Session session = HibernateConnection.Connect(); 
	
	public void addNewStudent(String name, String course, float fee, Date doa) {
		
		session.save(new Student(0,name,course,fee,doa)); 
		 
	}

}
