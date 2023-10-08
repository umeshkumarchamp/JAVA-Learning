package Enum;

public enum PizzaSize {

	SMALL("Small Pizza"),
	MEDIUM("Medium Pizza"),
	LARGE("Large Pizza"),
	EXTRA_LARGE("Extra Large Pizza"); 
	
	private String pizzaSizeText; 

	private PizzaSize(String pizzaSizeText) {
		this.pizzaSizeText = pizzaSizeText;
	}

	public String getPizzaSizeText() {
		return pizzaSizeText;
	}

	public void setPizzaSizeText(String pizzaSizeText) {
		this.pizzaSizeText = pizzaSizeText;
	} 
	
	
	
}

