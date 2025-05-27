package CRUD_26_05_25_Q2;

public class Test {

	public static void main(String[] args) {
		
		Activity a1=new Activity("Visit Eiffel Tower" ,"Morning");
		Destination d=new Destination("Paris");
		d.add(a1);
		ItineraryPlanner i=new ItineraryPlanner();
		i.add(d);
		i.retrive();

	}

}
