package March_09_03_23_JUnit;

public class Palindrome {

	public Boolean isPalindrome(String str) {
		
		// creating a blank string
	    String reverseStr = "";
	    
	    int strLength = str.length();
	    
	    for (int i = (strLength-1); i >=0; i--) {
	    	reverseStr = reverseStr + str.charAt(i); 
	    } 
	    
	    // Checking original string and reverse string are same or not.....
	    if(str.equals(reverseStr)) {
	    	return true; 
	    }
		return false;
	}
	
}
