package Enum;

public class Pizza {
	private String name;
	private PizzaSize pSize;
	private double price;

	public Pizza(String name, PizzaSize pSize) {
		super();
		this.name = name;
		this.pSize = pSize;
		this.price = calculatePrice();
	}

	private double calculatePrice() {
		switch (pSize) {

		case SMALL:
		default:
			return 100;
		case MEDIUM:
			return 200.50;
		case LARGE:
			return 500.00;
		case EXTRA_LARGE:
			return 700.50; 
		}

	}
	public String getName() {
		return name;
	}

	public PizzaSize getpSize() {
		return pSize;
	}

	public double getPrice() {
		return price;
	}
	

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", pSize=" + pSize + ", price=" + price + "]";
	}
	
	

	public static void main(String[] args) {
		
		
		
		
		// PizzaSize pz = PizzaSize.HIGH;
		// System.out.println(pz);

		System.out.println("\nAvailable Pizza Sizes : \n");
		
		for(PizzaSize i : PizzaSize.values())
		{
			System.out.println(i.getPizzaSizeText());
		}
		System.out.println();
		Pizza orderOne = new Pizza("Pizza 1", PizzaSize.SMALL);
		Pizza orderTwo = new Pizza("Pizza 2", PizzaSize.MEDIUM);
		Pizza orderThree = new Pizza("Pizza 3", PizzaSize.LARGE);
		Pizza orderFour = new Pizza("Pizza 4", PizzaSize.EXTRA_LARGE);
		System.out.println(orderOne);
		System.out.println(orderTwo);
		System.out.println(orderThree);
		System.out.println(orderFour);
		
		System.out.println();
		
		
	}
	
}
