package MultiThreading;

import java.util.Scanner;

public class Table implements Runnable {
	
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
		
		Table obj = new Table(); 
		Thread t = new Thread(obj); 
		t.start();

	}

}
