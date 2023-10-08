package GenericsMethod;

public class Method {

	public static void main(String[] args) {
		/* Generics : - It enables classes and interfaces to be parameterized
		 when define generics can be used with class , interface and method
		 Benefit of generics is eliminates the retendent code..
		 
		 Generics are only works wiht object types.
		*/
		
		// GENERICS METHOD.......
		
		Integer arr1[] = {19,23,54,82,38}; 
		Long arr2[] = {231l,51l,341l,21l,891l}; 
		String arr3[] = {"abe","def","zyz","kdk"}; 
		Character arr4[] = {'d','k','e','q'}; 
		
		arrPrinter(arr1); 
		
		System.out.println("Generic Method : ");

		aPrinter(arr1);
		System.out.println();
		aPrinter(arr3);
		System.out.println();
		System.out.println("\nFirst element of arr1 : "+firstEle(arr1));
		System.out.println("\nLast element of arr1 : "+LastEle(arr1));
	}
	
	// These are generic methods..
	
	public static <Type> void aPrinter(Type[] ar) {
		for(Type val : ar) {
			System.out.print(val+"\t");
		}
	}
	// returning first element of array.
	static <T> T firstEle(T[] ar) {
		return ar[0]; 
	}
	
	// returning last element of array.
	static <T> T LastEle(T[] ar) {
		return ar[ar.length-1]; 
	}
	
	
	
	// Normal method..
	static void arrPrinter(Integer[] a) {
		for(Integer i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	static void arrPrinter(Long[] a) {
		for(Long i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	static void arrPrinter(String[] a) {
		for(String i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	static void arrPrinter(Character[] a) {
		for(Character i : a) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}

}
