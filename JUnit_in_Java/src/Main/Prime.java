package Main;

public class Prime {
	
	public boolean checkPrime(int number) {
		boolean f = false; 
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				f = true; 
			}
		}
		return f; 
	}
	
}
