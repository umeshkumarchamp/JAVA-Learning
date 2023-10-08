package MultiThreading;

public class App extends Thread {
	
	public void run() {
		Thread.yield();
		for(int i =1; i<=5; i++) {
			System.out.println(i);
			if(i ==2)
				Thread.currentThread().stop();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" is Run Sucessfully.");
	}

	public static void main(String[] args) {
		/*
		      Multitasking - We can run multiple software at the same time.
		      
		      -> Process Based (Multitasking)
		      -> Thread Based (Multithreading)
		      
	  # Two way to create a thread : 
		1. Runnable Interface
		2. Thread class
	
	  # Life Cycle 
	  
	->	  New
	  	   |
	  	Runnable 
	  	   |
	  	Running 
	  	   |
	  	Terminate 
		      
		      
		 */
		 App obj = new App(); 
		 //obj.run();
		 obj.setName("MyThread 1");
		 obj.start();
		 
		 try {
			obj.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		System.out.println(obj.isAlive());
		
		 App obj2 = new App(); 
		 
		 obj2.start();
		 System.out.println(obj2);
//		 obj2.setPriority(MAX_PRIORITY);
//		 System.out.println(obj2.currentThread().getPriority());
//		

	}

}
