package Quiz;

import java.util.*;

class Sorted {

public static void main(String[] args) {

List <String> test = new ArrayList<String>();

test.add("Delhi");

test.add("Bombay");

test.add("Agra");

test.add("Varanasi");

test.add("Tata");

Collections.sort(test);

System.out.println("Sorted:" + test);

}

}