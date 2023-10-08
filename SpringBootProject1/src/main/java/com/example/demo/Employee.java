package com.example.demo;


public class Employee {

	private int emp_id; 
	private String emp_name; 
	private String degination;
	public Employee(int emp_id, String emp_name, String degination) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.degination = degination;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDegination() {
		return degination;
	}
	public void setDegination(String degination) {
		this.degination = degination;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", degination=" + degination + "]";
	} 
	
	
	
}
