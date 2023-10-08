package Quiz;

import java.util.*;

public class Col{

public static void main(String[] args) {

NavigableSet<Short> nset = new TreeSet <Short>();

nset.add(20);

nset.add(10);

System.out.println(nset.headSet(12));

}

}