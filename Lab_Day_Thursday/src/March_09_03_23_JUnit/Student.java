package March_09_03_23_JUnit;

public class Student {
	
	private int roll;  
	private String name;
	private int age; 
	private String address;
	
	// Creating Constructor......
	public Student(int roll, String name, int age, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// Creating getters and setters......
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}
