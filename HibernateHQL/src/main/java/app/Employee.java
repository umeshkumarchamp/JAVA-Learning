package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	@Id
	@Column(name = "Employee_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId; 
	private String empName; 
	private String degination; 
	private float salary; 
	
}
