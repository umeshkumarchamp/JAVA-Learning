package MultiThreading;

class JoinClass implements Runnable{
	public void run() {
		try {
			String name = Thread.currentThread().getName(); 
			for(int i=1; i<=3; i++) {
				System.out.println(name);
				Thread.sleep(500); 
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class JoinMethod {

	public static void main(String[] args) {
		
		JoinClass jn = new JoinClass(); 
		Thread t1 = new Thread(jn);
		Thread t2 = new Thread(jn);
		Thread t3 = new Thread(jn);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
			
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		t1.start();
		t3.start();	
		try {
			String name = Thread.currentThread().getName(); 
			for(int i=1; i<=3; i++) {
				System.out.println(name);
				Thread.sleep(500); 
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(Thread.currentThread().isAlive());
		
		Thread.currentThread().stop();
		
		System.out.println(Thread.currentThread().isAlive());
		
	}
}
