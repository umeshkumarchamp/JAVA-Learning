package Question;
import java.util.Scanner;
class IncifficientBalance extends Exception
{
	public IncifficientBalance(String msg) {
		super(msg); 
	}
}
public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int initial_balance = 30000; 
		System.out.print("Enter Amount : ");
		int num = sc.nextInt(); 
		try {
			BalanceQuery(num,initial_balance);
		}catch(IncifficientBalance e) {
			e.printStackTrace();
		}
		sc.close();
	}
	
	static void BalanceQuery(int bal, long initial_bal) throws IncifficientBalance{
		if((initial_bal - bal)<5000) {
			throw new IncifficientBalance("Incifficient Balance..."); 
		}
		else {
			System.out.println("Your Initial Balance : "+initial_bal);
			System.out.println("Your Current Balance is "+(initial_bal - bal));
		}
	}

}
