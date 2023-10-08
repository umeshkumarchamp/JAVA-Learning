package app.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml"); 
    	
//    	System.out.println(ac);
    	
//    	SBI sbi = (SBI) ac.getBean("sbi"); 
//    	sbi.creadit();
//    	sbi.debit();
//    	
//    	
//    	Axis axis = (Axis) ac.getBean("axis"); 
//    	axis.creadit();
//    	axis.debit();
    	
//    	RBI bank = (RBI) ac.getBean("bank"); 
//    	bank.creadit(); 
//    	bank.debit();
//
    	
    	System.out.println("Roll" + "\t" + "Name");
    	
    	Student s1 = (Student) ac.getBean("std1");  
    	System.out.println(s1.getRoll()+"\t"+s1.getName());
    	
    	Student s2 = (Student) ac.getBean("std2"); 
    	System.out.println(s2.getRoll()+"\t"+s2.getName());
        System.out.println( "\nJai Ho!!" );
    }
}
