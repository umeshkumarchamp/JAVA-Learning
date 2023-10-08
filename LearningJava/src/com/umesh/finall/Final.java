package com.umesh.finall;

// Final : Final elements can't be changes, overridden or inherited
// final keyword means you cannot inherit from it.
// static : 

/*
     The final keyword is a non-access modifier used for classes, attributes and methods, 
			which makes them non-changeable (impossible to inherit or override). The final keyword
			is useful when you want a variable to always store the same value, like PI (3.14159...).
			The final keyword is called a "modifier"
 */

// Static Keyword 
/*
 *  The static keyword is a non-access modifier used for methods and attributes. 
 *  Static methods/attributes can be accessed without creating an object of a class.
 *  static keyword is a class level method.
 */

class FinalDemo{
	// create a final method...
	public final void display() {
		
		System.out.println("This is Umesh Kumar Champ");
		
	}
}

public class Final {
	
	final int a = 10; 
	
	String name = "Ram"; 
	
	static String pName(String s) {
		return "Hello".concat(s); 
	}
	
	static int p = 1; 
	static void Person(int id, String name, int age) {
		System.out.println("Person "+p++);
		System.out.println("Person Id : "+id);
		System.out.println("Person Name : "+name);
		System.out.println("Person Age : "+age);
	}
	
	
	public static void main(String[] arga) {
		
		FinalDemo d = new  FinalDemo(); 
		d.display();
		
		Final f = new Final(); 
		System.out.println(f.a);
		// The final field Final.a cannot be assigned
		//f.a = 23; 
		
		System.out.println(f.a);
		
		System.out.println(Final.pName(" Umesh"));
		
		Final obj = new Final(); 
		
		System.out.println(obj.name);
		System.out.println();
		Final.Person(101, "Umesh", 23);
		System.out.println();
		Final.Person(102, "Ram", 32);
		
		
	}

}
