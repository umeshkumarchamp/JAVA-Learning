package model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int rollNumber; 
	
	@Column(name = "Student_Name", length = 20)
	private String name; 
	
	@Temporal(TemporalType.DATE)
	private Date DOA; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Course> course; 
	
	
	
}
