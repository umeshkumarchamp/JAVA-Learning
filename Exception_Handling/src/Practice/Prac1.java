package Practice;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args) {
		
		String str = null; 
		
		try {
			System.out.println(str.length());
		}catch(NullPointerException e) {
			//System.out.println(e);
			System.out.println("Null Can't be casted.");
		}
		
		System.out.println("This is Umesh Kumar Mahto");
		
		String s = "umeh"; 
		try {
			int a = Integer.parseInt(s);
			System.out.println(a);
			
		}catch(Exception e) {
			System.out.println("String "+s+" can't converted to Integer.");
		}
		
		System.out.println("String NumberFormatException.");
		
		
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("\nEnter Your age : ");
			int age = sc.nextInt(); 
			System.out.println("\nYour age is : "+age);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
