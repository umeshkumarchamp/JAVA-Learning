package Multithreading_Practice;

public class MyThread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThread ob1 = new MyThread(); 
		Thread t1 = new Thread(ob1);
		//Thread.currentThread().setName("Thread 1");
		t1.setName("Thread 1");
		t1.start();
		
		MyThread ob2 = new MyThread(); 
		Thread t2 = new Thread(ob2);
		t2.setName("Thread 2");
		t2.start();
		
		//MyThread ob3 = new MyThread(); 
		Thread t3 = new Thread(new MyThread());
		t3.setName("Thread 3 ");
		t3.start();

	}

}
