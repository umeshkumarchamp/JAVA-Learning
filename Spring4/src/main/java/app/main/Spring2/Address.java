package app.main.Spring2;

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
	private String pinCode;
	private String State;
}
