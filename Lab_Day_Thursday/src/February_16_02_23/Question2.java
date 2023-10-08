package February_16_02_23;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// q2. Write a program for implements arrayIndexOutOfBounds Exception.
		
		int arr[] = {2,4,6,8,10,12,14,16,18,20}; 
		Scanner sc = new Scanner(System.in);
		System.out.println("My Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\nEnter the index number ");
		int index = sc.nextInt();
		try {
			System.out.println("The element at index "+index+ " is "+ arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		

		sc.close();
	}

}
