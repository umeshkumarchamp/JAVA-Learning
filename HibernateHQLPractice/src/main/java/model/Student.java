package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id; 
	private String student_name; 
	private String course; 
	private long phone; 
	private String address; 
	
}
