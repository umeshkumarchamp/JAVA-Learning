package String_Buffer;

public class App {
	
	public static void main(String[] args) {
		StringBuffer strB = new StringBuffer("Abc"); 
		//strB = new StringBuffer();
		StringBuffer strb2 = new StringBuffer("Abc"); 
		
		System.out.println("Capacity : "+strB.capacity());
		
		System.out.println("Length : "+strB.length());
		
		System.out.println("Compare : "+strB.compareTo(strb2));
		
		
		
	}

}
