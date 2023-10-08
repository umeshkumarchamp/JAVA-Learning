package Quiz;

import java.util.*;

public class CollectionMNO {

public static void main(String[] args) {

Collection xl = new ArrayList();

xl.add("M");

xl.add("N");

xl.add("O");

xl.add("P");

xl.add("Q");

Iterator lt = xl.iterator();

lt.next();

lt.next();

lt.next();

lt.next();

lt.remove();

lt.previous();

lt.previous();

lt.remove();

System.out.println( xl);

}

}
