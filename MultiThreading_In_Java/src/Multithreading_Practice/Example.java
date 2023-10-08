package Multithreading_Practice;

public class Example extends Thread {

	public void run() {
		//System.out.println("This is Daemon Thread.");
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is daemon thread.");
		}
		else {
			System.out.println("This is not a daemon thread.");
		}
	}

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().isDaemon());

		//System.out.println(Thread.currentThread());
		Example ob = new Example(); 
		ob.setDaemon(true);
		//System.out.println(ob.getName());
		ob.start();
		System.out.println(ob.isDaemon());
		// daemon thread is use to provide service to another thread.
	}

}
