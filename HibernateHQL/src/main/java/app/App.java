package app;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

//    	********** HQL ********** 

		// Adding Record using random class..
//    	Random rand = new Random(); 
//    	
//    	String[] names = {"Atul","Manish","Rupesh","Umesh","Mahesh","Shubham","Nitesh","Ankit","Ram","Shyam"}; 
//    	String[] deg = {"HR","Markeeting","IT","Finance","Testing","Cyber Security","Developer","Engineer"};
//
//    	for(int i=1; i<=20; i++) 
//    	{
//    		Employee emp = new Employee(); 
//    		emp.setEmpId(i);
//    		emp.setEmpName(names[rand.nextInt(9)]);
//    		emp.setDegination(deg[rand.nextInt(7)]);
//    		emp.setSalary(rand.nextInt(50000));
//    		session.save(emp); 
//    	}
//    	

		System.out.println("\n****** For Multiple Result ****** \n");

//    	String query = "from Employee where degination = 'IT'";
		String query = "from Employee where empName =:x";
//    	String query = "from Employee as e where e.degination =:x and e.empId >=:y";
		Query q = session.createQuery(query);
		q.setParameter("x", "Umesh");
//    	q.setParameter("y" , 10);

		// multiple = list

		List<Employee> list = q.list();
//    	list.forEach(val-> System.out.println(val));
		System.out.println("\nName" + "\t" + "Degination" + "\t" + "Salary");
		for (Employee emp : list) {
			System.out.println(emp.getEmpName() + "\t" + emp.getDegination() + "\t\t" + emp.getSalary());
		}
		// single - (Unique)
		System.out.println("\n****** For Unique Result ****** \n");
		int Id = 10;
		Query query2 = session.createQuery("from Employee where empId = " + Id);
		Employee e = (Employee) query2.uniqueResult();
		System.out.println(e);

		tr.commit();
		session.close();
		sf.close();

		System.out.println("Success.");
	}
}
