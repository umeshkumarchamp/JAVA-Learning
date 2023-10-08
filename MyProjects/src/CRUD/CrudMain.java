package CRUD;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class CrudMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		Collection<Student> listOfStudent = new LinkedList<>(); 
		
		int ch = 0; 
		do {
			System.out.println("1. Add New Student Record ");
			System.out.println("2. Display All Student Record ");
			System.out.println("3. Search Student By Roll Number ");
			System.out.println("4. Delete Student Record ");
			System.out.println("5. Update Student Record ");
			System.out.println("6. Search Student By Course ");
			System.out.println("7. Search Student By Name ");
			System.out.println("\nEnter ' 0 ' for Exit!\n");
			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();
			
			switch(ch) 
			{
				case 1:
					Student st = Operations.addNewStudent(); 
					listOfStudent.add(st); 
					break; 
				case 2:
					Operations.displayDetails(listOfStudent);
					break; 
				case 3:
					System.out.print("Enter Roll No : ");
					int roll = sc.nextInt(); 
					Operations.searchStudent(listOfStudent, roll);
					break; 
				case 4:
					System.out.print("Enter Roll No : ");
					roll = sc.nextInt(); 
					Operations.deleteStudent(listOfStudent, roll);
					break; 
				case 5:
					System.out.print("Enter Roll that you want to update : ");
					roll = sc.nextInt();
					Operations.updateStudentRecord(listOfStudent, roll);
					break; 
				case 6:
					System.out.print("Enter course : ");
					String course = sc.next(); 
					Operations.searchBycourse(listOfStudent, course);
					break; 
				case 7:
					System.out.print("Enter name : ");
					String name = sc.nextLine();
					Operations.searchStudentByName(listOfStudent, name);
					break; 
				case 0:
					System.exit(0);
					break; 
				default:
					System.out.println("Invalid Choice ");
					break; 
					
			}
			
		}while(ch!=0); 

		
		
		sc.close();
	}

}
