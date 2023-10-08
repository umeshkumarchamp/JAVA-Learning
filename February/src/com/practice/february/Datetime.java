package com.practice.february;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime {

	public static void main(String[] args) {

		/*
		    04-05-2000
		   (dd/mm/yyyy)
		 */
		
		// DATE TIME FORMATTER
		
		LocalDateTime localdate = LocalDateTime.now();
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("hh:mm a");  
		String date = localdate.format(dateformat); 
		//String date = LocalDate.format(dateformat); 
		System.out.println(date);
		
		
		
		// printf() METHOD ...........
		// format specifier
		int a = 10; 
		int b = 20; 
		System.out.printf("Value of a = %d \nValue of b = %d",a,b);
		
		String name = "Umesh"; 
		// %10s is use for space
		System.out.printf("\nYour name  :%10s",name);
		System.out.printf("\nValue of a = \\%d Value of b = \"%d\"",a,b);
		
		float salary = 15553.4829564f; 
		System.out.printf("\nSalary = %5f ",salary);
		System.out.printf("\nSalary = %,f ",salary);
		
		
		char c = 'a'; 
		System.out.printf("\n%c is a character.",c);
		
		boolean bool = true; 
		System.out.printf("\n%b is a boolean value.", bool); 
		
		
		
	}

}
