package JDBC_CRUD;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int choice; 
		do {
			System.out.print("1. Add New Record.\n2.Update Record.\n3.Delete Record.\n4.Retrieve Record By Book Id.\n5.For Show All Records.\n6.Exit.\n\nEnter Your Choice : ");
			choice = sc.nextInt(); 
			
			switch(choice) {
			case 1:
				System.out.print("Enter Book Id : ");
				int b_id = sc.nextInt(); 
				sc.nextLine();
				System.out.print("Enter Book Name : ");
				String b_name = sc.nextLine();
				System.out.print("Enter Author Name : ");
				String b_author = sc.nextLine(); 
				System.out.print("Enter Book Price : ");
				int b_price = sc.nextInt();
				
				Service.insertRecord(b_id, b_name, b_author, b_price);
				
				System.out.println();
				break; 
			case 2:
				System.out.print("Enter Book Id : ");
				b_id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Book Name : ");
				b_name = sc.nextLine();
				System.out.print("Enter Author Name : ");
				b_author = sc.nextLine(); 
				System.out.print("Enter Book Price : ");
				b_price = sc.nextInt();
				
				Service.updateRecord(b_id, b_name, b_author, b_price);
				
				break; 
			case 3:
				System.out.print("Enter Book Id : ");
				b_id = sc.nextInt(); 
				Service.deleteRecord(b_id);
				break; 
			case 4:
				System.out.print("Enter Book Id : ");
				b_id = sc.nextInt(); 
				Service.searchRecordById(b_id);
				break; 
			case 5:
				System.out.println("********** All Records of Database **********\n");
				Service.showAllRecord();
				System.out.println();
				break; 
			case 6:
				System.out.println("\nHave a Good Day!");
				System.exit(0);
			default : 
				System.out.println("\nInvalid Input, Try Again ");
			}
			
			
		}while(choice != 6);
		
		
		
		sc.close();
		
		
//		for create new database...
//		Service.createDatabase();
		
//		Service.createTable();
		
//		Service.insertRecord(101,"Java","Manish Rana",8000);
		
//		Service.updateRecord(101, "Oracle", "Tinki Kumari", 3000);
		
//		Service.deleteRecord(101);
		
		
//		Service.searchRecordById(102);
		
		
	}

}
