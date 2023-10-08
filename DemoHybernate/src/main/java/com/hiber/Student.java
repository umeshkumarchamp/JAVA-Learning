package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int s_id; 
	private String s_name; 
	private String s_course; 
	private String s_address; 
	private int s_phone;
	public Student() {
		super();
	}
	public Student(int s_id, String s_name, String s_course, String s_address, int s_phone) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_course = s_course;
		this.s_address = s_address;
		this.s_phone = s_phone;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_course() {
		return s_course;
	}
	public void setS_course(String s_course) {
		this.s_course = s_course;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public int getS_phone() {
		return s_phone;
	}
	public void setS_phone(int s_phone) {
		this.s_phone = s_phone;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_course=" + s_course + ", s_address=" + s_address
				+ ", s_phone=" + s_phone + "]";
	}
	
	
	
	
	
}
