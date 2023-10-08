package Multithreading_Practice;

public class Demo extends Thread {

	Demo(String name){
		super(name); 
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread("My Thread"); 
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());

		System.out.println();
		Demo d1 = new Demo("Thread 1"); 
		System.out.println(d1.getName());
		
		Demo d2 = new Demo("Thread 2"); 
		System.out.println(d2.getName());
		
		Demo d3 = new Demo("Thread 3"); 
		System.out.println(d3.getName());
	}

}
