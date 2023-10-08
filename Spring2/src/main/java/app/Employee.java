package app;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Employee {
	
	private int emp_id; 
	private String emp_name; 
	private String address; 
	
	public Employee(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	
}
