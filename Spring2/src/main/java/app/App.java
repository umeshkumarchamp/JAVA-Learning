package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Employee emp1 = ac.getBean("emp1",Employee.class); 
    	System.out.println(emp1);
    	Employee emp2 = ac.getBean("emp2",Employee.class);
    	System.out.println(emp2);
    	
        System.out.println( "\nRun Successful." );
        
    }
}
