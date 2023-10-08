package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {

	@Id
	@Column(name = "Course_Id")
	private int c_id; 
	
	@Column(name = "Course_Name")
	private String c_name; 
	
	@Column(name = "Duration")
	private int duration; 
	
	@Column(name = "Fee")
	private int fee; 
	
	
}
