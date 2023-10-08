package Bank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {

	@Id
	@Column(name = "Account_Number")
	private long account_number;  
	@Column(name = "Bank_Name")
	private String bank_name; 
	
	@Column(name="Account_Holder_Name")
	private String holder_name;
	
	
	
}
