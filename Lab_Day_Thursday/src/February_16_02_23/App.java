package February_16_02_23;

import java.util.Scanner;

class InvalidMailIdException extends Throwable{
	public InvalidMailIdException (String msg) {
		super(msg); 
	}
}

public class App {

	public static void main(String[] args) throws InvalidMailIdException {

		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Your Email Id : ");
		String email = sc.nextLine(); 
		
		try {
			Validation(email);
			System.out.println("Your Email Id is Valid. ");
		}catch(InvalidMailIdException e) {
			e.printStackTrace();
		}
		

		sc.close();
	}
	
	static void Validation(String email) throws InvalidMailIdException {
		if(!email.contains("@")) {
			throw new InvalidMailIdException("Your Email is Invalid ! "); 
		}
	}

}
