package MultiThreading;

class A extends Thread{
	public void fun() {
		try {
			for(int i=1; i<=5 ; i++) {
				System.out.println("Child Thread");
				Thread.sleep(1000); 
			}
		}catch(InterruptedException i) {
			
		}
	}
}

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException  {
		
		A t = new A(); 
		//t.start();
		t.fun();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}

}
