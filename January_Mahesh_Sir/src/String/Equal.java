package String;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abc"; 
		String b = "Abc"; 
		b = b.toLowerCase(); // String class is immutable
		// == is check the memory reference  asci value
		System.out.println(a.equals(b));
		
		int res = a.length(); 
		System.out.println(res);
		int arr[] = {1,2,6,4,8 }; 
		System.out.println(arr.length);
		
		
		

	}

}
