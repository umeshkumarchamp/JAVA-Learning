package CrudProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CrudMain {

	public static void main(String[] args) {
		
		Collection<Student> listOfStudents = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do {
			System.out.println("1. Add New Student Record");
			System.out.println("2. Display all Student Record");
			System.out.println("3. Search Student by Roll Number");
			System.out.println("4. Delete Student record");
			System.out.println("5. Update an Existing Record");
			System.out.println("0. for Exit\n");
			
			System.out.print("Enter Your Choice here : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 : 
				Student st = Opertions.addNewStudent();
				listOfStudents.add(st);
				break;
			case 2 : 
				Opertions.displayAllStu(listOfStudents);
				break;
			case 3 : 
				System.out.print("Enter Roll number : ");
				int rollNumber = sc.nextInt();
				Opertions.searchStudent(listOfStudents, rollNumber);
				break;
			case 4 : 
				System.out.print("Enter Roll number : ");
				rollNumber = sc.nextInt();
				Opertions.deleteStudent(listOfStudents, rollNumber);
				break;
			case 5 :
				System.out.print("Enter Roll number : ");
				rollNumber = sc.nextInt();
				Opertions.updateStudentRec(listOfStudents, rollNumber);
				break;
			case 0 : System.out.println("exit");
					System.exit(0);
				break;
			default:System.out.println("invalid case ");
			}
		}while(ch!=0);
		
		sc.close();
	}
}
