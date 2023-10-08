package Practice;

public class Area {
	

	
	/*
	  WAP to print area of rectangle by creating a class name area
	  taking the value of its length and breadth as parameter of
	  its constructor and having a method named returnArea 
	  which return the area of rectangle. 
	 */
	
	Area(){} // This is constructor. 
	
	int length; 
	int breadth; 
	Area(int l, int b){  // This is parameterized constructor. 
		length = l; 
		breadth = b; 
	}
	public int getArea() {
		return length*breadth; 
	}

}
