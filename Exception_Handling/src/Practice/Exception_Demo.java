package Practice;

public class Exception_Demo {

	public static void main(String[] args) {
		
		int a = 6; 
		int b = 0; 
		
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("Your Can't divide a number by Zero!!"+e);
		}
		
		
		

	}

}
