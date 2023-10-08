package com.gyanly.emp;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee(123,"Mr.","Umesh","Vishwakarma","Finance");
		Employee emp2 = new Employee(123,"Mr.","Rahul","Vishwakarma","Finance");
		Employee emp3 = new Employee(123,"Mr.","Mohit","Vishwakarma","Finance");
		Employee emp4 = new Employee(123,"Mr.","Raju","Vishwakarma","Finance");
		Employee emp5 = new Employee(123,"Mr.","Ramesh","Vishwakarma","Finance");
		 //System.out.println(emp1.getMailingName(false)); 
		 
		 //DemoDep dep = new DemoDep("HR","Akash");
		 //System.out.println(dep.name());
		 
		 Employees employees = new Employees(5); 
		 employees.addEmployee(emp1);
		 employees.addEmployee(emp2);
		 employees.addEmployee(emp3);
		 employees.addEmployee(emp4);
		 employees.addEmployee(emp5);
		 
		 employees.printEmployee();
		 
		 
	}

}
