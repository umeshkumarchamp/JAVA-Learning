package AnnotationPrac;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id; 
	private String course_name;
	private byte duration; 
	private int fee; 	
	
}
