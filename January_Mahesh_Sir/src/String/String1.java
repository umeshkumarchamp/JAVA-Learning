package String;

public class String1 {

	public static void main(String[] args) {

		// Literal Process		
		String name = "Umesh Kumar";
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		
		
		// Dynamic String
		String n1 = new String("Champ Kumar ");
		System.out.println(n1);
		System.out.println(n1.concat(name));
		

	}

}
