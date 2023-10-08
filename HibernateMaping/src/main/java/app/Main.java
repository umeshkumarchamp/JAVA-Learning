package app;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import Bank_Mapping.Bank;
import Bank_Mapping.Customer;

public class Main {

	public static void main(String[] args) {
		
		Configuration con = new Configuration(); 
    	con.configure(); 
    	
    	Session session = con.buildSessionFactory().openSession(); 
    	
    	Bank b1 = new Bank(234242, "834BS823FA", "HDFC Bank", "Ranchi"); 
    	
    	Customer c1 = new Customer(); 
    	c1.setName("Raghav Kumar");
    	c1.setAddress("Ranchi");
    	c1.setBank(b1);
    	
    	Customer c2 = new Customer(); 
    	c2.setName("Gopal Kumar");
    	c2.setAddress("Harmu");
    	c2.setBank(b1);

    	session.save(c1); 
    	session.save(c2); 
    	
    	session.beginTransaction().commit();
    	
	}

}
