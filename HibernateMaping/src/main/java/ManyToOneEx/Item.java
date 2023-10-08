package ManyToOneEx;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

	@Id
	private int item_id; 
	private String item_name; 
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "JoinColumn",
	joinColumns = {@JoinColumn (name="cart_id")},
	inverseJoinColumns = {@JoinColumn(name="item_id")}
			)
	private Set<Cart> cart; 
	
}
