package com.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	private int emp_id;
	@Column(name="emp_email")
	private String employee_email; 
	@Column(name="emp_name")
	private String employee_name;
	
	
}
