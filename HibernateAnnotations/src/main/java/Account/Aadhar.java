package Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Aashar_Id")
	private int id; 
	
	@Column(name = "Aadhar_Number", length = 12, nullable = false)
	private long aadhar_number; 
	
	@Column(name = "Aadhar_Holder_Name")
	private String holder_name; 
	
	private String company; 
	
	
}
