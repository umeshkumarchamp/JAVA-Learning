package March_09_03_23_JUnit;

public class Main {

	// Creating method for addition of two numbers...
	public int addition(int a, int b) {
		int sum = a + b; 
		return sum; 
	}
	
	// creating method for multiply of two numbers...
	public int multiplication(int a, int b) {
		int mul = a * b; 
		return mul; 
	}
	
	public Boolean isPalindrome(String str) {
		
	    String reverseStr = "";
	    
	    int strLength = str.length();
	    
	    for (int i = (strLength-1); i >=0; i--) {
	    	reverseStr = reverseStr + str.charAt(i); 
	    } 
	    
	    if(str.equals(reverseStr)) {
	    	return true; 
	    }
		return false;
	}
	
	
}
