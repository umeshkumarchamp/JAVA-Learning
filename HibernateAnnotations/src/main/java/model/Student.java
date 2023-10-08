package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;

@Data

@Entity
@Table(name="Student_details")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="Student_Ids")
	private int std_id; 
	
	private String std_name; 
	
	@Temporal(TemporalType.DATE)
	private Date DOA; 
	private String std_address;
	
	@Column(name="Contact_number", length = 10)
	private String std_number; 
	
	@Lob
	private byte[] image;
	
	@Column(name="Email_Id", unique = true, length = 50, nullable =true)
	private String email; 
	
	private String extra; 
	
}
