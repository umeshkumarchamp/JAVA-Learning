package February_16_02_23;

class NullPointerException extends Exception{
	public NullPointerException(String msg) {
		super(msg); 
	}
}

public class Question3 {

	public static void main(String[] args) {
		// q3. Make a Method for accepting a String Array and
		//check if any index is having null value, than 
		//throw NullPointerException.

		String name[] = {"umesh","atul",null,"gautam"};
		System.out.print("\nMy name array is : ");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		try {
			CheckNullPointer(name);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}

	static void CheckNullPointer(String name[]) throws NullPointerException {
		
		for(int i=0; i<name.length; i++) {
			if(name[i] == null) {
				throw new NullPointerException("There is a null value at index "+i);
			}
		}
		
	}
	
}
