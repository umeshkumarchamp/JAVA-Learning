package Practice;

class GenericClass<T>{
	private T data; 
	public GenericClass(T data) {
		this.data = data; 
	}
	
	public T getData() {
		return this.data; 
	}
	
	
}

public class Generics_Example {

	public static void main(String[] args) {
		
//		GenericClass <String> str = new GenericClass("India"); 
//		System.out.println(str.getData());
//
//		GenericClass<Integer> num = new GenericClass(100); 
//		System.out.println(num.getData());
//		

		Generics_Example obj = new Generics_Example(); 
		obj.genericMethod("Umesh");
		obj.genericMethod(23);	
		obj.genericMethod(23.23);
		
	}

	public <E> void genericMethod(E data) {
		
		System.out.println("This is my data : " + data);
	}
	
	

}
