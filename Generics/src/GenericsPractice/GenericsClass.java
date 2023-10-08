package GenericsPractice;

import java.util.ArrayList;

public class GenericsClass {
	
	
	class MyGenerics<T>
	{
		int val;  
		private T t1;
		public MyGenerics(int val, T t1) {
			super();
			this.val = val;
			this.t1 = t1;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public T getT1() {
			return t1;
		}
		public void setT1(T t1) {
			this.t1 = t1;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		
		//arrayList.add("Umesh"); 
		arrayList.add(23); 
		arrayList.add(234); 
		int a = arrayList.get(2); 
		//String st = (String)arrayList.get(0); 
		System.out.println(a);
		
//		MyGenerics<String> g1 = new MyGenerics<String>(23,"MYString"); 
//		String str = g1.getT1(); 
//		System.out.println(str);
		
		
	}

}
