package exception_handling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter your name : ");
		String name = sc.nextLine(); 
		try {
			if(name == null) {
				throw new NullPointerException(); 
			}
			System.out.println("Welcome "+name);
		}catch(NullPointerException ex) {
			System.out.println(ex);
		}
		sc.close();
	}

}
