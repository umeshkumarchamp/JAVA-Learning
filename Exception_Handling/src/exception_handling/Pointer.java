package exception_handling;
import java.util.Scanner;
public class Pointer {

	public static void main(String[] args) {

//		System.out.println("Program Start.");
//		String name[] = {"Umesh","Dinesh","Mahesh","Ramesh"}; 
//		try {
//			for(String i : name) {
//				System.out.println(i.length());
//			}
//			//System.out.println(name.length);
//		}catch(Exception e) {
//			//System.out.println("This is null.");
//			//e.printStackTrace();
//			System.err.println("lkadjfad ");
//		}
//		
//		System.out.println("Program End.");
//		
		
		user(); 
	}
	
	static void user() {
		System.out.println("Program Start ");
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Your username : ");
		String user = sc.nextLine(); 
		System.out.print("Enter Your passsword : ");
		String pass = sc.nextLine(); 
		
		try {
			if(user == null && pass == null) {
				throw new NullPointerException(); 
			}
			System.out.println("Welcome "+user);
		}catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		System.out.println("Program End. ");
	
	}

}
