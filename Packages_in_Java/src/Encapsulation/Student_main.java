package Encapsulation;

public class Student_main {

	public static void main(String[] args) {

		Student ob3 = new Student();
		
		ob3.set_name("U");
		System.out.println(ob3.get_name());
		
		Student std1 = new Student(11,"Champ Kumar","BCA",2000,"Math"); 
		System.out.println(std1.getMailName());
		System.out.println(std1.getMailName(true));
		System.out.println(std1.getMailName(false));
		System.out.println();
		std1.display();
		
		
		System.out.println();
		Department dep = new Department("HR", "Umesh"); 
		System.out.println(dep.getName()); 
		
		// using record class 
		DemoDepartment demo = new DemoDepartment("HR", "Umesh"); 
		System.out.println(demo.managerName() );
		

	}

}
