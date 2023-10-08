package Question;

import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		/*
		   WAP to accept a string from user and check how many
		   character are vowel. 
		   
		 */
		
		Scanner sc = new Scanner(System.in); 
		// String str = sc.nextLine();
		String str = "sdkjfweubakdsfaeaef"; 
		String ustr = str.toUpperCase();
		char[] string = ustr.toCharArray(); 
		
		int count = 0; 
		for (int i = 0; i < string.length; i++) {
						
			if(string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u') {
				
				count++; 
			}
		}
		
		System.out.println("Number of Vowels : "+count);
		
		
		sc.close();

		
	}
	

}
