package exception_handling;

import java.util.Scanner;

/*
			Build in Exception
			/              \   
		Checked            Unchecked
			| 			          |
		classNotFound        ArithmathicException
		IOException           ClassCartException
		SQLException        Method   
		FileNotFound
		etc.
		
		*/

public class MyException {
	
	
	static void MyMethod() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Program Begins ");
		int a = 10; 
		System.out.print("Enter a number : ");
		int b = sc.nextInt(); 
		try {
			int data = a/b;
			System.out.println(data);
		}catch(ArithmeticException e){
			System.out.println("You can't divide a number by zero.");
		}
		
		System.out.println("Program Ends..");
		sc.close(); 
	}

	public static void main(String[] args) {
		
		MyMethod();

	}

}
