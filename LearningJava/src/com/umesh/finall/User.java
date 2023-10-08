package com.umesh.finall;
import java.util.Iterator;
import java.util.Scanner; 

public class User {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		String sentence ="Hey! This is Umesh Kumar Champ";
		char[] string = sentence.toCharArray(); 
		System.out.print("Enter a Character : ");
		char c = s.next().charAt(0);
		int count = 0; 
		for (int i = 0; i < string.length; i++) {
						
			if(c == string[i]) {
				count++; 
			}
		}
		System.out.println(c+ " is "+ count+" times in this sentence.");
		s.close();  

	}

}
