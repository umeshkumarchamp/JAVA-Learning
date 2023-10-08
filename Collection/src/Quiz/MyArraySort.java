package Quiz;

import java.util.*;

public class MyArraySort {

public static void main(String args[]) {

String[] book = { "Understanding EJB 3.0", "Java Server Programming"};

Arrays.sort(book);

System.out.print("Sorted Arrays" + " ");

for(String s: book) {
	System.out.print(s + " ");
}
	

}

}