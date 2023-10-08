package Bank_Project;

public class Main extends Thread {

	static Bank ob; 
	int no; 
	public void run() {
		ob.getBalance(no);
	}
	
	public static void main(String[] args) {
		
		ob = new Bank(); 

		Main ram = new Main(); 
		ram.no = 4000; 
		ram.start();
		
		Main shyam = new Main(); 
		shyam.no = 2000; 
		
		shyam.start();
		
	}

}
