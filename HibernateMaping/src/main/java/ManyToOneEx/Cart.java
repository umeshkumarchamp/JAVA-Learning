package ManyToOneEx;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

	@Id
	private int c_id; 
	private String c_name; 
	@ManyToMany
	private Set<Item> item; 
	
}
