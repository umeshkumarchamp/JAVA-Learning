package Multithreading_Practice;

public class Demo_Runnable implements Runnable {

	public static void main(String[] args) {
		Runnable ob1 = new Demo_Runnable(); 
		Thread t1 = new Thread(ob1,"Thread 1"); 
		t1.setPriority(8);
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Thread t2 = new Thread(new Demo_Runnable(),"Thread 2"); 
		t2.setPriority(10);
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t3 = new Thread(new Demo_Runnable(),"Thread 3"); 
		t3.setPriority(3);
		t3.start();
		
		//System.out.println(t3.isAlive());
		
	}

	@Override
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		System.out.println("Thread Id : "+Thread.currentThread().getId());
		System.out.println();
		//System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getId());
		for(int i=0; i<=5; i++) {
			System.out.println(i+" ");
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
