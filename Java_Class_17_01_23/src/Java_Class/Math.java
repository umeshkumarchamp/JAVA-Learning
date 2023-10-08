package Java_Class;

public class Math {
	int number1; 
	int number2; 
	int add; 
	int sub; 
	int div; 
	int mul; 
	int mod; 
	Math(){}
	Math(int num1 , int num2){
		number1 = num1; 
		number2 = num2; 
	}
	
	public void addition() {
		add = number1+number2;
		System.out.println("Addition of "+number1+" and "+number2+" = "+add);
	}
	
	public void subtraction() {
		sub = number1-number2;
		System.out.println("Subtraction of "+number1+" and "+number2+" = "+sub);
	}
	
	public void multiplication() {
		mul = number1*number2;
		System.out.println("Multiplication of "+number1+" and "+number2+" = "+mul);
	}
	
	public void division() {
		div = number1/number2;
		System.out.println("Division of "+number1+" and "+number2+" = "+div);
	}
	
	public void mod() {
		mod = number1%number2;
		System.out.println("Mod of "+number1+" and "+number2+" = "+mod);
	}
	
}
