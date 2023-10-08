package January_24_01_23.Tuesday;

public class Swap {
	
	Swap(){}

	//int a, b;
	int t1 = 0; 
	public void swap(int a , int b) {
		
		System.out.println("Before SWapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		t1 = a; 
		a = b; 
		b = t1; 
		
		System.out.println("After SWapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		
	}
	float t2; 
	public void swap(float a, float b) {
		
		
		System.out.println("Before SWapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		t2 = a; 
		a = b; 
		b = t2; 
		
		System.out.println("After SWapping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	}
	
	
}
