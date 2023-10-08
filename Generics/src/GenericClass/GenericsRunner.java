package GenericClass;

public class GenericsRunner {

	public static void main(String[] args) {
		
		MyCustomList<String> list = new MyCustomList<>(); 
		System.out.println("List 1 : ");
		list.addElement("Umesh");
		list.addElement("Dinesh");
		list.addElement("Manish");
		//list.displayElement();
		String value = list.get(0); 
		System.out.println(value);
		System.out.println(list);
		
		System.out.println("\nList 2 : ");
		MyCustomList<Integer> list2 = new MyCustomList<>(); 
		list2.addElement(23);
		list2.addElement(89);
		list2.addElement(45);
		list2.addElement(Integer.valueOf(77));
		
		//list2.displayElement();
		System.out.println(list.get(1));
		System.out.println(list2);
		
		
	}
	
}
