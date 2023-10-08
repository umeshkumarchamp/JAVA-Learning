package app;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure();

		SessionFactory factory = con.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tr = session.beginTransaction();

//    	*********** HQL ****************

//		Student st1 = new Student(); 
//		st1.setStudent_name("Umesh Kumar");
//		st1.setCourse("MCA");
//		st1.setAddress("Ranchi");
//		st1.setPhone(6201033951l);
//		
//		Student st2 = new Student(); 
//		st2.setStudent_name("Manish Rana");
//		st2.setCourse("MCA");
//		st2.setAddress("Hazaribag");
//		st2.setPhone(7029347138l);
//		
//		Student st3 = new Student(); 
//		st3.setStudent_name("Nirag Sahu");
//		st3.setCourse("MCA");
//		st3.setAddress("Lohardaga");
//		st3.setPhone(7734728385l);
//		
//		Student st4 = new Student(); 
//		st4.setStudent_name("Aakash Kumar");
//		st4.setCourse("BCA");
//		st4.setAddress("Dhanbad");
//		st4.setPhone(9534762348l);
//		
//		Student st5 = new Student(); 
//		st5.setStudent_name("Rupesh Kumar");
//		st5.setCourse("BCA");
//		st5.setAddress("TATA");
//		st5.setPhone(7834728438l);
//		
//		
//		session.save(st1); 
//		session.save(st2);
//		session.save(st3);
//		session.save(st4);
//		session.save(st5);		

//		Scanner sc = new Scanner(System.in); 

//		String query = "from Student";
//		Query q = session.createQuery(query);
//		List<Student> list = q.list();
//		list.forEach(val -> System.out.println(val));

//		System.out.print("\nEnter Name : ");
//		String name = sc.nextLine(); 
//		String query = "from Student where student_name =:s";
//		
//		
//		Query q = session.createQuery(query);
//		q.setParameter("s", name); 
//		List<Student> list = q.list(); 
//		list.forEach(val->System.out.println(val));

//		Query q = session.createQuery("from Student"); 
//		List<Student> list = q.list(); 
//		list.forEach(val-> System.out.println(val));

//		showRecords(con, session);
//		
//		Scanner sc =new Scanner(System.in); 
//		System.out.print("Enter Student Id : ");
//		int id = sc.nextInt(); 
//		searchById(id, session);
//		deleteRecord(session, 78);

		Scanner sc = new Scanner(System.in); 
		int choice = 0; 
		do {
			System.out.print("1. Add New Record. \n2. Update Record. \n3.Delete Record. \n4. Search REcord by Id.\n 5. Exit.\nEnter Your Choice : ");
			choice = sc.nextInt(); 
			
			switch(choice) {
			case 1:
				System.out.println("\n******** ADD NEW RECORD **********");
				System.out.print("\nEnter new Id : ");
				int id = sc.nextInt(); 
				sc.nextLine();
				System.out.print("\nEnter Your Name : ");
				String name = sc.nextLine();

				System.out.print("\nEnter Course : ");
				String course = sc.next();

				System.out.print("\nEnter Phone number : ");
				long phone = sc.nextLong();

				System.out.print("\nEnter Address : ");
				String address = sc.next();
				
				addNewRecord(id,name,course,phone,address, session, tr);
				System.out.println();
				break; 
			case 2 : 
				System.out.println("\n******** UPDATE RECORD **********");
				System.out.print("Enter Your Id : ");
				id = sc.nextInt(); 
				updateRecordById(session, id,tr);
				break; 
			case 3 :
				System.out.println("\n******** DELETE RECORD **********");
				System.out.print("Enter Your Id : ");
				id = sc.nextInt(); 
				deleteRecord(session, id);
				break; 
			case 4 :
				System.out.println("\n******** SEARCH RECORD **********");
				System.out.print("Enter Your Id : ");
				id = sc.nextInt();
				searchById(id, session);
				break; 
			case 5:
				System.exit(0);
				break; 
			default:
				System.out.println("Invalid Choice .......");
				break; 
					
			}
			
			
			
		}while(choice != 5); 
		
//		updateRecordById(session, 7);

//		addNewRecord(78,"Sweta Verma", "MCA", 9534170088l, "Hazaribag", session);

		tr.commit();

//		sc.close();
		System.out.println("\nJai Ho!!!!");
	}

	static void showRecords(Configuration con, Session sesion) {

		System.out.println("\n********** Multiple Result **********\n");

		Query q = sesion.createQuery("from Student");
		List<Student> list = q.list();
		list.forEach(val -> System.out.println(val));

	}

	static void searchById(int id, Session session) {
		System.out.println("\n********** Search Record By Id **********\n");

		Query q = session.createQuery("from Student where student_id =:x");
		q.setParameter("x", id);
		Student s = (Student) q.uniqueResult();
		System.out.println(s);

	}

	static void deleteRecord(Session session, int id) {
		Query q = session.createQuery("delete from Student where id = :x");
		q.setParameter("x", id);
		int r = q.executeUpdate();
		if (r >= 1) {
			System.out.println("Successfully delete record of ID = " + id);
		} else {
			System.out.println("Record not deleted.");
		}
	}

	static void updateRecordById(Session session, int id, Transaction tr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter New Name : ");
		String name = sc.nextLine();
		
		System.out.println();
		System.out.print("Enter Course : ");
		String course = sc.next();
		System.out.println();
		System.out.print("Enter Phone number : ");
		long phone = sc.nextLong();
		System.out.println();
		System.out.print("Enter Address : ");
		String address = sc.next();

		Query q = session.createQuery("update Student set student_name =:n , course = :c, phone =:p, "
				+ "address=:add where student_id = :id");

		q.setParameter("n", name);
		q.setParameter("c", course);
		q.setParameter("p", phone);
		q.setParameter("add", address);
		q.setParameter("id", id);
		session.saveOrUpdate(q);
		tr.commit();
		
		int r = q.executeUpdate();
		if (r >= 1) {
			System.out.println(r + " Record Updated.");
		} else {
			System.out.println("Not Updated....");
		}
		
	}

	static void addNewRecord(int id, String name, String course, long phone, String address, Session session, Transaction tr) {

		Student s = new Student();
		s.setStudent_id(id);
		s.setStudent_name(name);
		s.setCourse(course);
		s.setAddress(address);
		s.setPhone(phone);
		session.save(s);
		tr.commit();
		System.out.println("Record Added Successfully.");
	}

}
