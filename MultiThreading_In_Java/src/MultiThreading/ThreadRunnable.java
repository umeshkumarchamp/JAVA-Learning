package MultiThreading;

class DemoClass implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("This is Child Thread "+i);
				Thread.sleep(1000);
				if(i==3) {
					Thread.currentThread().stop();
				}
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}

public class ThreadRunnable {

	public static void main(String[] args) {
		DemoClass ob = new DemoClass(); 
		//ob.run();
		
		Thread t = new Thread(ob); 
		t.start();
		
	}
	
}
