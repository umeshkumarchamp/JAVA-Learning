package Bank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Customer_Id")
	private int c_id; 
	
	@Column(name = "Customer_Name")
	private String name; 
	
	private int age; 
	
	@Column(name = "Phone_Number")
	private long phone; 
	
	@OneToOne
	private Account account; 
}
