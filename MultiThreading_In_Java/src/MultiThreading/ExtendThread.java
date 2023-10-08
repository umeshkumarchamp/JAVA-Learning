package MultiThreading;

class NewThread extends Thread{
//	public NewThread() {
//		// create a new , second thread
//		super("Demo Thread"); 
//		System.out.println("Child Thread : "+this);
//		start(); // start the thread		
//	}
	// This is entry point for second thread... 
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread : "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Interrupted !");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		
		NewThread ob = new NewThread(); 
		//ob.start();
		ob.run();
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted.");
		}
		
		System.out.println("Main Thread Exiting.");
	}

}
