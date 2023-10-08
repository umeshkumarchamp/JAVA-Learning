package app;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

	private String city; 
	private String pincode; 
	private String state; 
	
}
