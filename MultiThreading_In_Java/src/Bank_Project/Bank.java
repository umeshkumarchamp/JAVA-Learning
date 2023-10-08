package Bank_Project;

public class Bank {

	Integer balance = 50000; 

	synchronized void getBalance(Integer amt) {
		
		if(balance>=amt) {
			System.out.println("Debited Successfully.");
			balance = balance - amt; 
			System.out.println("Debited Balance : "+amt);
			System.out.println("Remaining Balance : "+balance);
			System.out.println("---------------------------------\n");
		}
		else {
			System.out.println("Transation Failed because your remaining balance is "+balance +" and you try to debit "+amt);
		}
	}
	
}
