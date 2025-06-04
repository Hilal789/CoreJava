package PriorityQueue_04_06_25;

import java.util.PriorityQueue;

public class Q2 {

	public static void main(String[] args) {
		
		PriorityQueue< String > pq = new PriorityQueue<>();
		PriorityQueue< String > pq1 = new PriorityQueue<>();
		
		pq.add("Red");
		pq.add("Green");
		pq.add("Orange");
		
		
		pq1.add("Pink");
		pq1.add("White");
		pq1.add("Black");
		
		pq.addAll(pq1);
		
		System.out.println(pq);
		
	}

}
