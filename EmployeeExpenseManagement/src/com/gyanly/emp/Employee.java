package com.gyanly.emp;

public class Employee {
	private int id;
	private String title;
	private String firstName;
	private String surname;
	private String department;	
	
	public Employee() {
		super();
	}	
	
	public Employee(int id, String title, String firstName, String surname, String department) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.department = department;
	}
	
	public String getMailingName() {
		return title + " " + firstName + " " + surname;
	}
	
	public String getMailingName(Boolean isTitle) {
		if(isTitle) {
			return title + " " + firstName + " " + surname;

		}else {
			return firstName + " " + surname;
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		if(firstName.length() < 2) {
			System.out.println("Error - first name should be at least 2 characterr");
		}else {
			this.firstName = firstName;
		}		
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
