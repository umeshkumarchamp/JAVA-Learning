package GenericsPractice;
// Generic Class
public class GenericTest <T> {
		GenericTest(T b) {
			System.out.println("This is "+b);
		}
	
		public void getName(T name) {
			System.out.println("Your name is "+name);
		}
}
