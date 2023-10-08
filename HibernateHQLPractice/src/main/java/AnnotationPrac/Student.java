package AnnotationPrac;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student_Id")
	private int student_id; 
	@Column(name = "Student_Name")
	private String name; 
	private int age;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private College college; 
	
	@OneToOne(cascade = CascadeType.ALL)
	private Course course;}
