package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student_Roll")
	private int roll; 
	@Column(name = "Student_Name" , length = 30)
	private String name;
	@Column(name = "" , length = 30)
	private String course;
	
	private float Fee; 
	
	@Temporal(TemporalType.DATE)
	private Date Date; 
	
}
