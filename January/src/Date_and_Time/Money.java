package Date_and_Time;

import java.math.BigDecimal;

public class Money {

	public static void main(String[] args) {
		
		// Boxing : Convert Class to primitive data type 
		
		Double price = 45.234d;
		double p = price; // Boxing 
		System.out.println(p);
		
		Integer i1 = 234234; 
		int i = i1; // unboxing.
		System.out.println(i);
		
		Double d = 1d; 
		for(int r=1; r<=10; r++)
		{
			d+=0.1; 
			System.out.println(d);
		}
		
		BigDecimal total = new BigDecimal("1"); 		
		for(int j=0; j<10; j++)
		{
			total = total.add(new BigDecimal("0.1")); 
			System.out.println(total);
		}
		
		
	}

}
