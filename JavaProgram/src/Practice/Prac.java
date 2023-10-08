package Practice;

public class Prac {

	public static void main(String[] args) {
		
		System.out.println("Maximum Value : "+Integer.MAX_VALUE); 	
		System.out.println("Minimum Value : "+Integer.MIN_VALUE);
		
		String s = "2432";
		Integer no = Integer.parseInt(s); 
		System.out.println(no); 
		
		
		
		
		minimum(); 
		maximum(); 
		
		
		// Swapping -> Swapping is a process for changing the values of two 
		// variables 
		/*
		    -using third variable
		    - without using third variable
		 */
		
		
		
		
		
		int a = 3; 
		int b = 8; 
		System.out.println("Before swapping : a = "+a+" b = "+b); 
		swap(a,b); 
		System.out.println("Before swapping : a = "+a+" b = "+b); 

		
		
	}
	
	static void minimum()
	{
		// WAP to find minimum number from an array?
		
				int arr[] = {65,64,12,23,69}; 
				
				//int max = Integer.MAX_VALUE; 
				System.out.println();
				int min=arr[0]; 
				System.out.print("Array Elements :- "); 
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+" ");
					if(arr[i] < min)
					{
						min = arr[i]; 
					}
				}
				System.out.println("\nMinimum value : "+min);
				
	}
	
	
	static void maximum() {
		// WAP to find maximum number from an array?
				int arr[] = {22,44,86,13,41,19,67,55}; 
				int max = Integer.MIN_VALUE; 
				System.out.print("Array Elements :- " );
				for(int i=0; i<arr.length; i++)
				{
					System.out.print(arr[i]+" "); 
					if(max < arr[i])
					{
						max = arr[i]; 
					}
				}
				System.out.println("\nMaximum value - "+max); 
	}
	
	// WAP to sort array elements without using in-build function or method.
	
	static void swap(int a, int b) {
		
		int t; 
		t = a; 
		a = b; 
		b = t; 
			
		
	}
	
	
	

}
