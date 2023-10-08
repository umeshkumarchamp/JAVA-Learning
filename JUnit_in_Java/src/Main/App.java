package Main;

public class App {

	public int add(int n1, int n2) {
		return n1 + n2; 
	}
	
	public int mul(int n1, int n2) {
		return n1 * n2; 
	}
	
	public int div(int n1, int n2) {
		return n1/n2; 
	}
	
	public int sub(int n1, int n2) {
		return n1-n2; 
	}
	
	public int Vowels(String name) {
		
		if(name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o")|| name.contains("u")) {
			return 1; 
		}
		return 0;
		
	}
	
	public boolean CheckString(String s1, String s2) {
		if(s1.equals(s2)) {
			return true; 
		}
		return false; 
	}
	
	public int myMethod(int[] arr) {
		
		int sum = 0; 
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i]; 
		}
		
		return sum;
		
	}
	
}
