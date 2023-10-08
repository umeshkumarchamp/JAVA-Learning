package GenericsPractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericTest<String> str = new GenericTest<>("Umesh");
		str.getName("Champ");
		GenericTest<Integer> num = new GenericTest<Integer>(23); 
	
		
		Main m = new Main();
		
		Integer arr[] = {2,4,5,8,4,9};
		String s[] = {"Umesh","Manish","Sweta","Priya","Muskan","Atul","Tinki","Khushboo"};
		m.printArray(arr);
		m.printArray(s);
		
	}


	// Generic Method
	public <T> void printArray(T a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i] +" ");
		}
	}
	
}
