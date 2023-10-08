package Quiz;

import java.util.Set;
import java.util.TreeSet;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean bool [] = new boolean[5];
        
        Set<Boolean> s = new TreeSet<>();
        
        bool[0] = s.add(10);
        
        bool[1] = s.add(new Integer(22));
        
        bool[2] = s.add("b");
        
        bool[3] = s.add("a");
        
        for(int i = 0; i<bool.length;i++)
        
        System.out.print(bool[i] + " ");

	}

}
