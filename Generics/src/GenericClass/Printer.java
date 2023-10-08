package GenericClass;

public class Printer <T1,T2> {
	T1 val1;
	T2 val2; 
	Printer(T1 val1,T2 val2){
		this.val1 = val1; 
		this.val2 = val2; 
	}
	
	public void p() {
		System.out.println(this.val1 + " : "+this.val2);
	}
	
}
