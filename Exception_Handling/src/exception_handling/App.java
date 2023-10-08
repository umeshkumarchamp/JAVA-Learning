package exception_handling;

/*
		Build in Exception
		/              \   
	Checked            Unchecked
	| 			          |
classNotFound        ArithmathicException
IOException           ClassCartException
SQLException        Method   
FileNotFound
etc.

*/
public class App {
	
	static void myMethod() {
		String names[] = {"Umesh","Manish","Dinesh","Mahesh","Ram","Shyam"};  
		
		try {
			for(int i=0; i<=names.length; i++)
			{
				System.out.println(names[i]);
			}
		}catch (Exception ex)
		{
			System.out.println("Your array index is out of limit.");
		}
		
	}
	
	public static void main(String[] args) {
		
		myMethod();


	}
	

}
