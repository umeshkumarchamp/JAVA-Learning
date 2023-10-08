package Interface_in_Java;
import java.util.Scanner;
public class Name implements client {

	String name; 
	double salary; 
	
	@Override
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		name = s.nextLine(); 
		System.out.print("Enter Your Salary : ");
		salary = s.nextDouble(); 
		
		
	}

	@Override
	public void output() {
		System.out.println("Your Name : "+name);
		System.out.println("Your Salary : "+salary);
		
		
	}

	
	
}
