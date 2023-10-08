package app;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@GeneratedValue
	private int emp_id; 
	private String emp_name; 
	private float salary; 
//	private byte[] image; 
	
	
}
