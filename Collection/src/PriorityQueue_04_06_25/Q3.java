package PriorityQueue_04_06_25;

import java.util.PriorityQueue;

public class Q3 {

	public static void main(String[] args) {
		
		PriorityQueue< String > pq = new PriorityQueue<>();
		PriorityQueue< String > pq1 = new PriorityQueue<>();
		
		pq.add("Red");
		pq.add("Green");
		pq.add("Black");
		pq.add("White");
		
		
		pq1.add("Red");
		pq1.add("Pink");
		pq1.add("Black");
		pq1.add("Orange");
		
		
		System.out.println("First :"+pq+"\nSecond :"+pq1);
	for(String p1:pq)
	{
		
		boolean b=false;
		
		for(String p2:pq1)
		{
			if(p1.equals(p2))
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println(p1+" :Yes");
		}
		else
		{
			System.out.println(p1+" NO");
		}
	}
		
		

	}

}
