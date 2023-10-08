package Java_Class;
import java.util.Scanner; 
public class Area {
	
	int length; 
	int breadth;  
	public void setDim(int l, int b) {
		
		length = l; 
		breadth = b; 
	}
	
	public int getArea() {
				
		return length * breadth; 
	}
	
	

	public static void main(String[] args) {
		/*
		 
		Write a program to print the area of a rectangle by creating a class named 'Area' having two
		methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
		and the second method named as 'getArea' returns the area of the rectangle. 
		Length and breadth of rectangle are entered through keyboard.
		 
	 */
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter Length : ");
		int len = sc.nextInt(); 
		System.out.print("Enter Breadth : "); 
		int bed = sc.nextInt();
		
		Area ar = new Area(); 
		ar.setDim(len, bed);
		System.out.println("Area of the rectangle : "+ar.getArea()); 

	}
	
	
}
