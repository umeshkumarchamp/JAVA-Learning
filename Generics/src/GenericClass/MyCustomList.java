package GenericClass;

import java.util.ArrayList;

public class MyCustomList<T> {

	ArrayList<T> list = new ArrayList<>(); 
	
	public void addElement(T element) {
		list.add(element); 
	}
	
	public void removeElement(T element) {
		list.remove(element); 
	}
	
	public void displayElement() {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}
	
}
