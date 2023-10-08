package Practice;

import java.util.Scanner;

class InvalidMailIdException extends Exception{
	public InvalidMailIdException(String msg) {
		super(msg); 
	}
}

public class EmailVerify {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter Your email : ");
		String email = sc.nextLine(); 
		
		try {
			Validation(email);
			System.out.println("Successfully Login.");
		} catch (InvalidMailIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		sc.close();

	}

	static void Validation(String email) throws InvalidMailIdException{
		if(!email.contains("@")) {
			throw new InvalidMailIdException("Your email is not valid...");
		}

	}
	
}
