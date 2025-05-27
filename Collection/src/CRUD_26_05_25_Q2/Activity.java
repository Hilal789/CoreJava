package CRUD_26_05_25_Q2;

public class Activity {
	private String name;
	private String schedule;
	public Activity(String name, String schedule) {
		super();
		this.name = name;
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "-"+name + "(" + schedule + ")";
	}
	
	
}


