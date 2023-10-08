package app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import ManyToOneEx.Cart;
import ManyToOneEx.Item;

public class MainCart {

	public static void main(String[] args) {
		
    	Configuration con = new Configuration(); 
    	con.configure(); 
    	
    	Session session = con.buildSessionFactory().openSession(); 
    	
    	Cart cart = new Cart(); 
    	cart.setC_id(101);
    	cart.setC_name("Cart 1");
    	cart.setItem(null);
    	
    	Set<Cart> setOfCart = new HashSet<Cart>(); 
    	setOfCart.add(cart); 
    	
    	Item item = new Item(); 
    	item.setItem_id(3452);
    	item.setItem_name("Item 1");
    	item.setCart(setOfCart);
    	
    	Set<Item> setOfItem = new HashSet<Item>(); 
    	setOfItem.add(item); 
    	
    	session.save(cart); 
    	session.save(item); 
    	
    	session.beginTransaction().commit();
    	System.out.println("Successfull.");
    	
	}
	
}
