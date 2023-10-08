package ComparatorVsComparable;

public class Student  {
	private int roll; 
	private String name;
	private int age; 
	private float percentage;
	public Student(int roll, String name, int age, float percentage) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getPercentage() {
		return percentage;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", percentage=" + percentage + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.roll > o.roll) {
//			return 1; 
//		}
//		else if(this.roll < o.roll) {
//			return -1; 
//		}
//		return 0;
//	} 
	
	
	
	

}
