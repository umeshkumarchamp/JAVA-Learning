package CRUD;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Operations {

	static Scanner sc = new Scanner(System.in); 
	
	public static Student addNewStudent() 
	{
		int roll; 
		String name; 
		String contact; 
		String course;
		
		System.out.print("Enter Student Roll : ");
		roll = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Enter Student Name : ");
		name = sc.nextLine(); 
		System.out.print("Enter Student Contact : ");
		contact = sc.next(); 
		System.out.print("Enter Student Course : ");
		course = sc.next(); 
		
		Student st = new Student(roll,name,contact,course); 
		System.out.println("\nStudent Recrod Added.");
		System.out.println("\nPress Enter to Continue ....");
		try {
			System.in.read();
		}catch(IOException e) {}
		
		
		return st;
		
		
	}
	
	
	public static void displayDetails(Collection<Student> studentRecord) {
		
		System.out.println();
		studentRecord.forEach(val-> System.out.println(val));
		System.out.println();
		System.out.println("\nPress Enter to Continue ....");
		try {
			System.in.read();
		}catch(IOException e) {}
		
	}
	
	public static void searchStudent(Collection<Student> st,int roll_no) 
	{
		
		boolean f = false; 
		Iterator<Student> itr = st.iterator(); 
		while(itr.hasNext()) 
		{
			Student _st = itr.next(); 
			if(_st.getRoll_number() == roll_no) 
			{
				System.out.println(_st);
				f = true; 
			}
		}
		if(!f) {
			System.out.println("\nStudent not found");
		}
		System.out.println("\nPress Enter to Continue....");
		try {System.in.read();}
		catch(IOException e) {}
	}
	
	
	public static void deleteStudent(Collection<Student> st, int roll_no)
	{
		boolean flag = false; 
		Iterator<Student> it = st.iterator(); 
		while(it.hasNext()) {
			Student s = it.next(); 
			if(s.getRoll_number() == roll_no) {
				it.remove();
				flag = true; 
			}
		}
		if(flag) {
			System.out.println("\nStudent Record Deleted Successfully.");
		}
		else {
			System.out.println("\nStudent not found.");
		}
	}
	
	public static void updateStudentRecord(Collection<Student> st, int roll_no)
	{
		boolean flag = false; 
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext()) {
			Student std = itr.next(); 
			if(std.getRoll_number() == roll_no) 
			{
				sc.nextLine(); 
				System.out.print("\nEnter New Student Name :");
				String name = sc.nextLine(); 
				std.setStudent_name(name);
				System.out.print("Enter new contact no : ");
				String contact = sc.nextLine();
				std.setContact_number(contact);
				System.out.print("Enter new course : ");
				String course = sc.nextLine(); 
				std.setCourse(course);
				
				std.setStudent_name(name);
				std.setContact_number(contact);
				std.setCourse(course);
				
				flag = true; 
				
			}
		}
		if(flag) {
			System.out.println("\nStudent Record Updated.");
		}
		else {
			System.out.println("\nStudent Not Found.");
		}
	}
	
	public static void searchBycourse(Collection<Student> st, String course) 
	{
		System.out.println();
		boolean f = false; 
		Iterator<Student> itr = st.iterator(); 
		while(itr.hasNext()) 
		{
			Student std = itr.next(); 
			if(std.getCourse() == course) 
			{
				System.out.println(std);
				f = true; 
			}
		}
		if(!f) {
			System.out.println("\nStudent not found");
		}
		System.out.println("\nPress Enter to Continue....");
		try {System.in.read();}
		catch(IOException e) {}
	}
	
	
	public static void searchStudentByName(Collection<Student> st,String name) 
	{
		
		boolean f = false; 
		Iterator<Student> itr = st.iterator(); 
		while(itr.hasNext()) {
			Student _st = itr.next() ;
			if(_st.getStudent_name() == name) {
				System.out.println(_st);
				f = true; 
			}
		}
		if(!f) {
			System.out.println("\nStudent not found");
		}
		System.out.println("\nPress Enter to Continue....");
		try {System.in.read();}
		catch(IOException e) {}
	}
	
	
	
}
