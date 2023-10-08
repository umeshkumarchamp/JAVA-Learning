package Question;
import java.util.Scanner;

class NumberInvalidException extends Exception
{
	public NumberInvalidException(String msg) {
		super(msg); 
	}
}
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt(); 
		try {
			OddEven(num);
		}catch(NumberInvalidException e) {
			e.printStackTrace();
		}

		sc.close();
	}
	
	static void OddEven(int num) throws NumberInvalidException{
		
		if(num < 1 || num>1000)
		{
			throw new NumberInvalidException("Number Invalid Exception"); 
		}
		else
		{
			if(num % 2 == 0) {
				System.out.println(num+" is even number.");
			}
			else {
				System.out.println(num+" is odd number.");
			}
		}
	}

}
