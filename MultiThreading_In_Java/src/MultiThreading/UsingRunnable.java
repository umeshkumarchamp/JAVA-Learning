package MultiThreading;


class Abc implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class UsingRunnable {
	
	public static void main(String[] args) {
		
		Runnable ob1 = new Abc(); 
		Thread t1 = new Thread(ob1);
		Thread.currentThread().setName("This is Thread 1.");
		t1.start();
		
		Thread ob2 = new Thread(new Abc());
		ob2.setName("Thread 2.");
		ob2.start();
		
		Thread ob3 = new Thread(new Abc()); 
		ob3.setName("Thread 3");
		ob3.start();
		
	}

}
