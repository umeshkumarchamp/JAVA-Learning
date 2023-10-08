package TreeSet_Practice;

public class Test implements Comparable<Test> {
	
	private String name; 
	private int age;
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Test o) {
//		if(this.age > o.age) {
//			return 1; 
//		}
//		else if(this.age < o.age) {
//			return -1; 
//		}
		
		//return Integer.compare(this.age, o.age);
		return o.age - this.age; 
		
		//return 0;
	} 
	
	
}
