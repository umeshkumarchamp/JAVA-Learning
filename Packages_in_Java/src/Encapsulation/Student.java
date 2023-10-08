package Encapsulation;

public class Student {

	private int roll_no; 
	private String name; 
	private String course;
	private int dob; 
	private String department; 
	

	Student(){
		super(); 
	}
	
	
	
		public Student(int roll_no, String name, String course, int dob, String department) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.course = course;
		this.dob = dob;
		this.department = department; 
	}
	public String getMailName() {
		return name; 		
	}
	
	public String getMailName(Boolean isTitle) {
		
		if(isTitle) {
			return roll_no+ " "+ name; 
		}
		else
		{
			return course; 
		}
	}



		public int get_roll() {
			return roll_no; 
		}
		
		public void set_roll(int roll) {
			this.roll_no = roll; 
		}
		
		public String get_name() {
			return name; 
		}
		
		public void set_name(String name) {
			if(name.length() < 1) {
				System.out.println("Error : name should be at least 2 character !");
			}
			this.name = name; 
		}
		
		public String get_course() {
			return course; 
		}
		
		public void set_course(String course) {
			this.course = course; 
		}
		
		public int get_dob() {
			return dob; 
		}
		
		public void set_dob(int dob) {
			this.dob = dob; 
		}
		
		
		public String getDepartment() {
			return department;
		}



		public void setDepartment(String department) {
			this.department = department;
		}



		public void display() {
			System.out.println("Name : "+name); 
			System.out.println("Roll : "+roll_no);
			System.out.println("Course : "+course); 
			System.out.println("DOB : "+dob);
			System.out.println("Department : "+ department);
			System.out.println();
		}
	
	
	

}
