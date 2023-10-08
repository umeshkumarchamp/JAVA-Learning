package Lab_Test;

import java.util.Scanner;

//Q3. Create a Thread which prints Multipication table of a given number and each number
//	will be printed after 1 second delay.


public class Table implements Runnable {
	@Override
	public void run() { 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number : ");
		int n = sc.nextInt(); 
		
		for(int i=1; i<=10; i++)	{
			System.out.println(n+" x "+i+" = "+(n*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Table Created Successfully.");
		sc.close();
	}

	public static void main(String[] args) {

		Table obj = new Table();  // Creating Object of table class... 
		Thread t = new Thread(obj); // Creating object of thread class...
		t.start();   // start the thread..

	}

}
