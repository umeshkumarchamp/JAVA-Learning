package January_24_01_23.Tuesday;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print p1 = new Print(); 
		p1.PrintE(23);
		p1.PrintE(234235326);
		p1.PrintE(23.3f);
		p1.PrintE(234.89);
		p1.printE("Umesh");
		

		System.out.println();
		
		// Area of rectangle and square
		
		Area a1 = new Area(); 
		a1.area(5, 8);
		a1.area(6);
		
		System.out.println();
		
		// Person 
		Person e1 = new Person(); 
		e1.pDetails(101, "Umesh Kumar", 23, 3);
		System.out.println();
		e1.pDetails(102, "Champ Kumar", 2);
		
		
		
	}

}
