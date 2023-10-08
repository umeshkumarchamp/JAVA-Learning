//package February_16_02_23;
//
//import java.util.Scanner;
//
//class InvalidMailIdException extends Exception{
//	public InvalidMailIdException(String msg) {
//		super(msg); 
//	}
//}
//
//public class Question1 {
//
//	public static void main(String[] args) {
//
//		// q1. Create your own class name InvalidMailIdException and 
//				//throw Exceptions if email id does't contains @ symbol.
//
//		Scanner sc = new Scanner(System.in); 
//				
//		System.out.print("Enter Your Email Id : ");
//		String email = sc.nextLine(); 
//		
//		//System.out.println(email.contains("@"));
//		
//		try {
//			CheckValidation(email);
//			System.out.println("Your Email is Correct.");
//		}catch(InvalidMailIdException e) {
//			e.printStackTrace();
//		}
//				
//				
//				
//				
//		sc.close();
//			
//	}
//
//	static void CheckValidation(String email) throws InvalidMailIdException {
//		int count = 0; 
//		for(int i=0; i<email.length(); i++) 
//		{
//			if(email.charAt(i) == '@') {
//				count++; 
//			}
//		}
//		if(count == 0) {
//			throw new InvalidMailIdException("Your Email Id is not Valid !");
//		}
//	}
//	
//}
