package CRUD_26_05_25_Q2;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {
	
	List <Destination> l1=new ArrayList();
	
	public void add(Destination d)
	{
		l1.add(d);
	}
	
	public void retrive()
	{
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}

	
	

}
