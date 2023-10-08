package Bank_Mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bank {

	@Id
	private int bank_id; 
	private String ifsc_code;
	private String bank_name; 
	private String branch; 
	
	
	
}
