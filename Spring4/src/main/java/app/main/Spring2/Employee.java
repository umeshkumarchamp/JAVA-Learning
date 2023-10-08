package app.main.Spring2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private Address address;
	public Employee(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
	}
	
	
}
