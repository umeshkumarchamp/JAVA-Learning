package CRUD;

public class Student {

	private int roll_number; 
	private String student_name; 
	private String contact_number; 
	private String course;
	
	
	
	public Student(int roll_number, String student_name, String contact_number, String course) {
		super();
		this.roll_number = roll_number;
		this.student_name = student_name;
		this.contact_number = contact_number;
		this.course = course;
	}




	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", student_name=" + student_name + ", contact_number="
				+ contact_number + ", course=" + course + "]";
	}






	public int getRoll_number() {
		return roll_number;
	}




	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}




	public String getStudent_name() {
		return student_name;
	}




	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}




	public String getContact_number() {
		return contact_number;
	}




	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	} 
	
	
	
	
}
