package Practice;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter Length : ");
		int len = sc.nextInt(); 
		
		System.out.print("Enter Breadth : ");
		int bed = sc.nextInt();
		
		Area ar = new Area(len,bed); 
		int area = ar.getArea();
		System.out.println("Area of Rectangle : "+area); 
		
		sc.close();
	}

}
