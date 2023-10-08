package Quiz;

import java.util.*;

public class HashQues {

public static void main(String[] args) {

Integer int1 = new Integer(10);

Integer int2 = new Integer(10);

System.out.println(int1== int2);

System.out.println(int1.hashCode()== int2.hashCode());

}

}