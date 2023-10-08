package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Course_Ids")
	private int c_id; 
	
	@Column(name="Course_Name",length = 20, nullable = false)
	private String c_name;
	
	
	private byte duration; 
	private int fee; 
	

}
