package Quiz;

import java.util.*;

public class TestQuestion

{

public static void main(String[] args)

{

List list1 = new ArrayList ( );

List <Object> list2 = list1;

list1.add(10);

list1.add(11);

list1.add("mona") ;

list1.add(true);

System.out.println(list1);

System.out.println(list2);

}

}