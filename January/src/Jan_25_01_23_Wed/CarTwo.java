package Jan_25_01_23_Wed;

public class CarTwo extends Car {
	
	private String model;  

	public CarTwo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public CarTwo(String name, String model) {
		super(name);
		this.model = model;
	}
	
	public void getDetails() {
		System.out.println("The Car Name is : "+super.name+".\nThe model is : "+model);
		
	}
	
	

	
}
