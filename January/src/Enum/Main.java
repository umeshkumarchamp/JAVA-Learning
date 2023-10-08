package Enum;

public class Main {
	
	enum Level{
		low,
		medium, 
		high
	}

	public static void main(String[] args) {
		
		Level var = Level.high; 
		PizzaSize p = PizzaSize.MEDIUM; 
		System.out.println(p);
		
		switch(var) 
		{
			case low:
				System.out.println("This is low level.");
				break; 
			case medium:
				System.out.println("This is medium level.");
				break; 
			case high:
				System.out.println("This is high level.");
		}
		
		for(Level i : Level.values())
		{
			System.out.println(i);
		}
		

	}

}
