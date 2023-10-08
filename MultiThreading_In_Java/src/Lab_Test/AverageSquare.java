package Lab_Test;

//	Q1. Create two thread.one thread is finding average of first 10 
//	numbers and other thread is printing square of number store in
//	array arr={1,20,50,15,30} and make sure both thread can execute
//	one by one.

// Creating a class for average...
class Average implements Runnable{

	@Override
	public void run() {
		float avg = 0; 
		int sum = 0; 
		for(int i=1; i<=10; i++) {
			sum = sum+i; 
		}
		avg = sum/10; 
		System.out.println("Average of first 10 numbers is : "+avg);	
	}
	
}

// Creating a class for square ...
class Square implements Runnable{

	@Override
	public void run() {
		int arr[] = {1,20,50,15,30};
		int size = arr.length; 
		int[] NewArray = new int[size];
		for(int i=0; i<size; i++) {
			NewArray[i] = arr[i]*arr[i]; 
		}
		System.out.println("\nPrint Original Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nPrinting Square of Original Array : ");
		for(int i=0; i<size; i++) {
			System.out.println("Square of "+arr[i]+" : "+NewArray[i]);
		}
	}
	
}

public class AverageSquare {

	public static void main(String[] args) {

		Average ob = new Average(); // Creating object of average clas
		Thread t1 = new Thread(ob); // Creating object of 1st thread 
		t1.start();  // thread start
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread t2 = new Thread(new Square()); // Creating object of 2nd thread
		t2.start();
		
	}

}
