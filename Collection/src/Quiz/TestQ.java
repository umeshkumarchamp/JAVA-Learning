package Quiz;

import java.util.*;

public class TestQ {

public void addmore(ArrayList l1) {

l1.add("We");

}

public static void main(String[] args) {

ArrayList <String>als = new ArrayList<String>();

als.add("I");

als.add("You");

TestQ obj = new TestQ( );

obj.addmore(als);

System.out.println(als);

}

}