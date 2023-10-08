package Jan_25_01_23_Wed;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar; 
		TataPunch tp = new TataPunch("Tata Punch : Top Model");
		//tp.getDetails();
		
		CarTwo ct = new CarTwo("This is New Car"); 
		CarTwo ct2 = new CarTwo("This is New Car","Model - BMW"); 
		ct.getDetails();
		mycar = ct2; 
		
	}

}
