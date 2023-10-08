package March_09_03_23_JUnit;

public class Square {

	public int[] squareOfSeries(int [] arr) {
		
		int[] ar = new int[arr.length]; 
		for(int i=0; i<arr.length; i++) {
			ar[i] = arr[i] * arr[i]; 
		}
		
		return ar;
		
	}
	
	public static void main(String[] args) {
	
		Square ob = new Square(); 
		
		int arr[] = {1,2,3}; 
		int arr2[] = {1,4,9}; 
		int arr3[] = ob.squareOfSeries(arr); 
		
		for(int a : arr2) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a : arr3) {
			System.out.print(a+" ");
		}
		
		if(arr2 == arr3) {
			System.out.println("true");
		}
		
		
	}
	
}
