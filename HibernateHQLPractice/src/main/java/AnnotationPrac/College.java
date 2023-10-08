package AnnotationPrac;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class College {

	@Id
	private int college_id; 
	private long college_registration;
	private String college_name; 
	private String college_address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Course> course;
	
	
}
