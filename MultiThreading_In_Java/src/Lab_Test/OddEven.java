package Lab_Test;

//Q2. Create two threads to print odd numbers and even numbers from 1 to 100?

class OddThread extends Thread{
	
	public void run() {
		System.out.println("Odd Number from 1 to 100 :");
		
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class EvenThread extends Thread{
	
	public void run() {
		System.out.println("\nEven Number from 1 to 100 :");
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class OddEven {	
	
	public static void main(String[] args) {
		
		OddThread ob = new OddThread(); // Creating object of oddthread class
		Thread t1 = new Thread(ob); // Creating object of 1st thread
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		EvenThread ob2 = new EvenThread(); // Creating object of eventhread class
		Thread t2 = new Thread(ob2); // Creating object of 2nd thread
		t2.start();

		
	}

}
