package Interface_in_Java;

public class Main {

	public static void main(String[] args) {

		/*
		       1. What is interface ? 
		       Ans :- Interface is just like a class, which contains only abstract methods. 
		             To achieve interface java provides a keyword called implements. 
		             
		            -> Interface methods are bydefault public and abstract.
		            -> Interface variables are bydefault public + static + final.  
		            -> Interface methods must be overriden inside the implementing classes. 
		            -> Interface nothing but deals between client and developer. 		       
		       
		 */
		
		client p1 = new Name(); 
		p1.input();
		p1.output();
	

	}

}
