package Interface_in_Java;

interface customer{
	int amt = 5; 
	void purchase(); 
}

class seller implements customer{

	@Override
	public void purchase() {
		System.out.println("Customer needs "+amt+" Kg rice.");
	}
	
}

public class Check {

	public static void main(String[] args) {
		
		customer c = new seller(); 
		c.purchase();

		System.out.println(customer.amt);
	}

}
