package Java_Class;

public class Student {
	
	int roll; 
	String name; 
	Student(){}
	
	Student(int roll_no, String Std_name)
	{
		roll = roll_no; 
		name = Std_name; 
		
	}
	
	public void display()
	{
		System.out.println("Roll No : "+roll); 
		System.out.println("Student name : "+name); 
	}

}
