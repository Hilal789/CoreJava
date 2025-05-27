package CRUD_26_05_25_Q2;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	
	String dName;
	List l;
	
	public Destination(String dName) {
		this.dName=dName;
		l=new ArrayList<Activity>();
	}
	
	public void add(Activity a)
	{
		l.add(a);
	}
	
	public String retrive()
	{
		for(int i=0;i<l.size();i++)
		{
			return ""+l.get(i);
		}
		return "";
		
	}

	@Override
	public String toString() {
		return "Destination:"+ dName+"\n"+retrive();
	}

	
	
	

}
