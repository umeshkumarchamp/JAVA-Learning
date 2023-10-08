package Quiz;

import java.util.*;

public class TestQuestion2 implements Comparable<Integer> {

public static void main(String[] args) {

int [ ] arr = {1, 2, 3, 4};

PriorityQueue <Integer> pq = new PriorityQueue<Integer>();

for(int x :arr)

pq.offer(x);

System.out.println(pq.peek());

System.out.println(pq.poll());

System.out.println(pq.size());

}

@Override
public int compareTo(Integer o) {
	// TODO Auto-generated method stub
	return 0;
}

}