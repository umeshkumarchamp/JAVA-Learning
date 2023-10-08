package GenericClass;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer<String,Integer> intPrinter = new Printer<>("id",832); 
		Printer<String, Double> doublePrinter = new Printer<>("Salary",25000.00); 
		Printer<String , Integer> stringPrinter = new Printer<>("Age",23);  
		
		intPrinter.p();
		stringPrinter.p();
		doublePrinter.p();
		
	}

}
