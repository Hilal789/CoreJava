package Enum_Overriding_12_05_25;

public class Clerk extends Employee {

	int speed;
	int accuracy;
	boolean check;

	public Clerk() {

	}

	public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
		super(name, employeeId, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public void setSalary(double salary) {
		if (speed > 70 && accuracy > 80 && check == false) {

			super.setSalary(getSalary() + 1000);
			
			System.out.println("Update Salary : " + getSalary());
			check = true;
		} else {
			super.setSalary(getSalary());
		System.out.println("No discount  " +super.getSalary());
		}

	}

}
